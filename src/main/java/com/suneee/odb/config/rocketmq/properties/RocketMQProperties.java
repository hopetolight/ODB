package com.suneee.odb.config.rocketmq.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * RocketMQ配置模型
 * @ClassName: RocketMQProperties
 * @Author: ChenBo
 * @DateTime: 2018/12/19:17:18
 */
@ConfigurationProperties(prefix = "spring.rocketmq")
@Data
public class RocketMQProperties {

    /** Rocket地址 */
    private String namesrvAddr="172.19.24.197:9876";
    /** 消费者组 */
    private String consumrGroupName="DTU_KVMSG";
    /** 实例名称 */
    private String consumerInstanceName="MQ_GPS_CONSUMER";
    /** 消费GPS主题,默认值为空Rocket不消费 */
    private String consumerGpsTopic;
    /** 消费ECU主题,默认值为空Rocket不消费*/
    private String consumerEcuTopic;
}
