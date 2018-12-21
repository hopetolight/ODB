package com.suneee.odb.service.impl;

import com.suneee.odb.config.httpclient.service.HttpAPIService;
import com.suneee.odb.config.system.properties.SystemProperties;
import com.suneee.odb.model.httpclient.HttpResult;
import com.suneee.odb.service.WriteMessage;
import com.suneee.odb.util.EncryptUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * 杭州OBD 检查平台接口调用用服务
 * @ClassName: WriteMessageImpl
 * @Author: ChenBo
 * @DateTime: 2018/12/20:15:25
 */
@Slf4j
@Service
public class WriteMessageImpl implements WriteMessage {

    /** 注入Http服务 */
    private final HttpAPIService httpAPIService;

    /** 注入系统配置 */
    private final SystemProperties properties;

    @Autowired
    public WriteMessageImpl (HttpAPIService httpAPIService, SystemProperties properties) {
        this.properties = properties;
        this.httpAPIService = httpAPIService;
    }

    /**
     * 鉴权接口
     * @param json JSON数据
     * @Author:ChenBo
     * @DateTime 2018/12/20:14:25
     */
    @Override
    public String authObjectOut (String json) {
        HttpResult httpResult = requestMethod (properties.getAuthUrl (),properties.getJkYhm (), properties.getJkSqm (), json);
        return httpResult.toString ();
    }



    /**
     * 数据写入接口
     * @param json JSON数据
     * @Author:ChenBo
     * @DateTime 2018/12/20:14:27
     */
    @Override
    public String writeObjectOut (String json) {
        HttpResult httpResult = requestMethod (properties.getWriteUrl (),properties.getJkYhm (), properties.getJkSqm (), json);
        return httpResult.toString ();
    }

    /**
     * 故障类数据写入接口
     * @param json JSON数据
     * @Author:ChenBo
     * @DateTime 2018/12/20:14:28
     */
    @Override
    public String writeFaultObjectOut (String json) {
        HttpResult httpResult = requestMethod (properties.getFaultUrl (),properties.getJkYhm (), properties.getJkSqm (), json);
        return httpResult.toString ();
    }

    /**
     * 心跳接口
     * @param json JSON数据
     * @Author:ChenBo
     * @DateTime 2018/12/20:14:28
     */
    @Override
    public String beatObjectOut (String json) {
        HttpResult httpResult = requestMethod (properties.getBeatUrl (),properties.getJkYhm (), properties.getJkSqm (), json);
        return httpResult.toString ();
    }

    /**
     * 获取交换识别码
     * @param data
     * @param jkYhm
     * @Author:ChenBo
     * @DateTime 2018/12/21:15:36
     */
    @Override
    public String getExchangeCode (String data, String jkYhm) {
        String seq = new SimpleDateFormat ("ddHHmmss").format (new Date ());
        StringBuilder exchangeCod=new StringBuilder (properties.getJkYhm ())
                .append (data).append (seq);
        return exchangeCod.toString ();
    }


    /**
     * 请求方法
     * @param jkYhm 接口用户名
     * @param jkSqm 接口授权码
     * @Author:ChenBo
     * @DateTime 2018/12/21:10:42
     */
    private HttpResult requestMethod (String url,String jkYhm,String jkSqm,String json) {
        HttpResult httpResult =null;
        try {
            String writeJsonDoc = EncryptUtil.aesEncrypt (json, properties.getKeyStr ());//请求参数加密
            String crcCode = EncryptUtil.checkCRC (json); //请求参数校验
            Map<String,String> paramMap=new ConcurrentHashMap<> ();
            paramMap.put ("jkYhm",jkYhm);
            paramMap.put ("jkSqm",jkSqm);
            paramMap.put ("WriteJsonDoc",writeJsonDoc);
            paramMap.put ("crcCode",crcCode);
            httpResult = httpAPIService.doPost (url, paramMap);
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return httpResult;
    }
}
