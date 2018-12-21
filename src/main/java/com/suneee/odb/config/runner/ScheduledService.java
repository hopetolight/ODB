package com.suneee.odb.config.runner;

import com.alibaba.fastjson.JSON;
import com.suneee.odb.config.system.properties.SystemProperties;
import com.suneee.odb.model.reporting.*;
import com.suneee.odb.service.AssemblyData;
import com.suneee.odb.service.WriteMessage;
import com.suneee.odb.util.SystemCache;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @
 * @ClassName: ScheduledService
 * @Author: ChenBo
 * @DateTime: 2018/12/21:14:00
 */
@Component
@Slf4j
public class ScheduledService {

    @Autowired
    private SystemProperties systemProperties;

    @Autowired
    private WriteMessage writeMessage;

    @Autowired
    private AssemblyData assemblyData;

    @Scheduled(fixedRate = 60000)
    public void sheduled(){


        List<ReportingDataBody> reportingDataBodyList = SystemCache.getReportingDataBodyList ();
        ReportingData reportingData = new ReportingData ();
        reportingData.setBody (reportingDataBodyList);
        String data = new SimpleDateFormat ("yyyyMMddHHmmss").format (new Date ());
        reportingData.setRequestTime (data);
        reportingData.setExchangeCode (writeMessage.getExchangeCode (data,systemProperties.getJkYhm ()));
        reportingData.setExchangeType ("10");
        reportingData.setVersion ("1.0");
        String json = JSON.toJSONString (reportingData);
        String s = writeMessage.writeObjectOut (json);


        log.info ("=============>写入数据返回结果[{}]",s);
    }


    @Scheduled(fixedRate = 30000)
    public void sheduled1(){
        assemblyData.authData ();
        List<AuthObjectBody> authObjectBodyList = SystemCache.getAuthObjectBodyList ();
        AuthObjectData authObjectData = new AuthObjectData ();
        authObjectData.setBody (authObjectBodyList);
        String data = new SimpleDateFormat ("yyyyMMddHHmmss").format (new Date ());
        authObjectData.setExchangeCode (writeMessage.getExchangeCode (data,systemProperties.getJkYhm ()));
        authObjectData.setBody (authObjectBodyList);
        authObjectData.setExchangeType ("30");
        authObjectData.setRequestTime (data);
        authObjectData.setVersion ("1.0");
        String json = JSON.toJSONString (authObjectData);
        String s1 = writeMessage.authObjectOut (json);

        log.info ("=============>鉴权返回结果[{}]",s1);

    }


    /**
     * 心跳
     * @Author:ChenBo
     * @DateTime 2018/12/21:16:42
     */
    @Scheduled(fixedRate = 30000)
    public void sheduled2(){
        BeatObjectData beatObjectData = new BeatObjectData ();
        String data = new SimpleDateFormat ("yyyyMMddHHmmss").format (new Date ());
        beatObjectData.setExchangeCode (writeMessage.getExchangeCode (data,systemProperties.getJkYhm ()));
        beatObjectData.setExchangeType ("00");
        beatObjectData.setRequestTime (data);
        beatObjectData.setVersion ("1.0");
        String json = JSON.toJSONString (beatObjectData);
        String s = writeMessage.beatObjectOut (json);
        log.info ("=============>心跳返回结果[{}]",s);

    }
}
