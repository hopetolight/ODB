package com.suneee.odb.config.serializer.constant;

import com.suneee.odb.model.rocketmq.*;

import java.util.HashMap;

/**
 * @
 * @ClassName: Constants
 * @Author: ChenBo
 * @DateTime: 2018/12/18:11:28
 */
public class Constants {

    /** 及时通知类消息主题 */
    public static final String MQ_TOPIC_NOTIFY = "NOTIFY_DATA";
    /**  工况上报类消息主题 */
    public static final String MQ_TOPIC_ECU = "ECU_DATA";
    /** GPS上报类消息主题 */
    public static final String MQ_TOPIC_GPS = "GPS_DATA";

    /** 缓存消息TAG名 与 CLASS的映射关系，用于反序列化 */
    public static HashMap<String ,Class> serializeMap = new HashMap<>();

    public static HashMap<String ,Class> serializeMap2 = new HashMap<>();

    static{
        serializeMap.put(DtuAlarm.class.getSimpleName(), DtuAlarm.class);
        serializeMap.put(DtuBindAck.class.getSimpleName(), DtuBindAck.class);
        serializeMap.put(DtuControlSwitchAck.class.getSimpleName(), DtuControlSwitchAck.class);
        serializeMap.put(DtuFault.class.getSimpleName(), DtuFault.class);
        serializeMap.put(DtuInfo.class.getSimpleName(), DtuInfo.class);
        serializeMap.put(DtuLimitStatusAck.class.getSimpleName(), DtuLimitStatusAck.class);
        serializeMap.put(DtuOnlineStatus.class.getSimpleName(), DtuOnlineStatus.class);

        serializeMap.put(EcuData.class.getSimpleName(), EcuData.class);
        serializeMap.put(GpsInfo.class.getSimpleName(), GpsInfo.class);
        serializeMap.put(BatchGpsInfo.class.getSimpleName(), BatchGpsInfo.class);
        serializeMap.put(BatchEcuData.class.getSimpleName(), BatchEcuData.class);
        serializeMap.put(DtuAlarmEnd.class.getSimpleName(), DtuAlarmEnd.class);
        serializeMap.put(DtuFlow.class.getSimpleName(), DtuFlow.class);
        serializeMap.put(DtuFlowAlarm.class.getSimpleName(), DtuFlowAlarm.class);
        serializeMap.put(OBDInfo.class.getSimpleName(), OBDInfo.class);

        serializeMap2.put(FaultAlarmCancel.class.getSimpleName(), FaultAlarmCancel.class);
        serializeMap2.put(BatchNotifyGpsInfo.class.getSimpleName(), BatchNotifyGpsInfo.class);
        serializeMap2.put(BatchNotifyEcuDataTime.class.getSimpleName(), BatchNotifyEcuDataTime.class);
        serializeMap2.put(EcuDataSimple.class.getSimpleName(), EcuDataSimple.class);
        serializeMap2.put(GpsInfoSimple.class.getSimpleName(), GpsInfoSimple.class);
    }
}
