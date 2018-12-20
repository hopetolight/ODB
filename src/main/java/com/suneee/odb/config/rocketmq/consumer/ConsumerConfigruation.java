package com.suneee.odb.config.rocketmq.consumer;

import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;
import com.alibaba.rocketmq.client.consumer.MQPushConsumer;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.common.consumer.ConsumeFromWhere;
import com.alibaba.rocketmq.common.protocol.heartbeat.MessageModel;
import com.suneee.odb.config.rocketmq.consumer.listener.TopicEcuMessageListener;
import com.suneee.odb.config.rocketmq.consumer.listener.TopicGpsMessageListener;
import com.suneee.odb.config.rocketmq.properties.RocketMQProperties;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @RocketMQ消费者配置类
 * @ClassName: ConsumerConfigruation
 * @Author: ChenBo
 * @DateTime: 2018/12/18:11:55
 */
@SpringBootConfiguration
@EnableConfigurationProperties({RocketMQProperties.class})
@Slf4j
public class ConsumerConfigruation implements InitializingBean, DisposableBean {


    @Autowired
    private TopicGpsMessageListener topicGpsMessageListener;

    @Autowired
    private TopicEcuMessageListener topicEcuMessageListener;

    @Autowired
    private RocketMQProperties properties;

    private List<MQPushConsumer> consumerList = new ArrayList<> ();

    @Override
    public void afterPropertiesSet () throws Exception {
        start();
    }

    @Override
    public void destroy () throws Exception {
        Iterator<MQPushConsumer> iterator = consumerList.iterator ();
        while (iterator.hasNext ()){
            MQPushConsumer pushConsumer = iterator.next ();
            pushConsumer.shutdown ();
        }
        log.info ("Consumer shutdown.............");
    }


    /**
     *
     * @Author:ChenBo
     * @DateTime 2018/12/19:17:00
     */
    private DefaultMQPushConsumer createPushConsumer(String nameServerAddr, String groupName, String instanceName){
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer(groupName);
        consumer.setInstanceName(instanceName);
        consumer.setNamesrvAddr(nameServerAddr);
        return consumer;
    }

    private void start(){


        if (!StringUtils.isBlank (properties.getConsumerGpsTopic ())){
            /********订阅GPS类消息并消费*********/
            DefaultMQPushConsumer gpsConsumer = createPushConsumer(properties.getNamesrvAddr (), properties.getConsumrGroupName ()+"_GPS", properties.getConsumerInstanceName ());
            try {
                gpsConsumer.subscribe(properties.getConsumerGpsTopic (), "*");
                gpsConsumer.setMessageModel(MessageModel.BROADCASTING);
                gpsConsumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_LAST_OFFSET);
                gpsConsumer.registerMessageListener(topicGpsMessageListener);
                gpsConsumer.start();
                consumerList.add(gpsConsumer);
                log.info ("consumer["+ properties.getConsumrGroupName ()+"_GPS] started , subscribe topic:" + properties.getConsumerGpsTopic ());
            } catch (MQClientException e) {
                e.printStackTrace();
            }
        }else if (!StringUtils.isBlank (properties.getConsumerEcuTopic ())){
            /********订阅工况类消息并消费*********/
            DefaultMQPushConsumer ecuConsumer = createPushConsumer(properties.getNamesrvAddr (), properties.getConsumrGroupName ()+"_ECU", properties.getConsumerInstanceName ());
            try {
                ecuConsumer.subscribe(properties.getConsumerEcuTopic (), "*");
                ecuConsumer.registerMessageListener(topicEcuMessageListener);
                ecuConsumer.setMessageModel(MessageModel.BROADCASTING);
                ecuConsumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_LAST_OFFSET);
                ecuConsumer.start();
                consumerList.add(ecuConsumer);
                log.info ("consumer["+ properties.getConsumrGroupName ()+"_ECU] started , subscribe topic:" + properties.getConsumerEcuTopic ());
            } catch (MQClientException e) {
                e.printStackTrace();
            }
        }




        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                try {
                    destroy ();
                } catch (Exception e) {
                    e.printStackTrace ();
                }
            }
        }));

    }



}
