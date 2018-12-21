package com.suneee.odb.config.rocketmq.consumer.listener;

import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import com.alibaba.rocketmq.common.message.MessageExt;
import com.suneee.odb.config.serializer.constant.Constants;
import com.suneee.odb.config.serializer.impl.KryoSerializer;
import com.suneee.odb.model.rocketmq.BatchEcuData;
import com.suneee.odb.model.rocketmq.EcuData;
import com.suneee.odb.service.AssemblyData;
import com.suneee.odb.util.SystemCache;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @ ECU工况主题类消息监听处理器
 * @ wjf
 * @ 2016-07-21
 */
@Service
@Slf4j
public class TopicEcuMessageListener implements MessageListenerConcurrently {

    @Autowired
    private KryoSerializer kryoSerializer;

    @Autowired
    private AssemblyData assemblyData;

    @Override
    public ConsumeConcurrentlyStatus consumeMessage (List<MessageExt> msgs, ConsumeConcurrentlyContext context) {




        if (log.isDebugEnabled ()) {
            log.debug ("Receive New Messages size={} ", msgs.size ());
        }
        boolean flag = true;
        if (CollectionUtils.isEmpty (msgs)) {
            return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
        }
        List<EcuData> allDatas = new ArrayList<> ();
        try {
            for (MessageExt msg : msgs) {
                if (msg.getTopic ().equals (Constants.MQ_TOPIC_ECU)) {
                    String tag = msg.getTags ();
                    if (tag != null && EcuData.class.getSimpleName ().equals (tag)) {
                        EcuData ecudata = KryoSerializer.getInstance ().fromBytes (msg.getBody (), EcuData.class);
                        allDatas.add (ecudata);
                    } else if (tag != null && BatchEcuData.class.getSimpleName ().equals (tag)) {
                        BatchEcuData batchEcuData = kryoSerializer.fromBytes (msg.getBody (), BatchEcuData.class);

                        if (!CollectionUtils.isEmpty (batchEcuData.getEcuDatas ())) {
                            allDatas.addAll (batchEcuData.getEcuDatas ());
                        }
                    } else {
                        log.warn ("Incorrect tag {},continue", Thread.currentThread ().getName (), tag);
                    }
                } else {
                    log.warn ("Incorrect topic {},continue", Thread.currentThread ().getName (), msg.getTopic ());
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace ();
            log.warn ("反序列化ECU 出现异常 {}", ex.getMessage ());
            flag = true;
        }
        boolean consumerRet = true; //消费处理结果
        try{
            EcuData ecuData = allDatas.get (0);
            String dtuId = ecuData.getDtuId ();

//            log.info ("接收到的ECU 数据为:--->[{}],DtuID =[{}],数据个数=[{}]", ecuData.getValues (),dtuId,ecuData.getValues ().size ());
            SystemCache.addEcuData (ecuData);
            assemblyData.reportingDarta ();
//            log.info ("接收到的ECU 数据为:--->[{}]", SystemCache.getEcuSize ());
            consumerRet=true;
        }catch (Exception e){
            consumerRet=false;
            e.printStackTrace ();
        }
        return consumerRet ? ConsumeConcurrentlyStatus.CONSUME_SUCCESS : ConsumeConcurrentlyStatus.RECONSUME_LATER;
    }
}
