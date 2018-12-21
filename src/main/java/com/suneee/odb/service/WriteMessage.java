package com.suneee.odb.service;

/**
 * @
 * @ClassName: WriteMessage
 * @Author: ChenBo
 * @DateTime: 2018/12/20:14:24
 */
public interface WriteMessage {

    /**
     * 鉴权接口
     * @Author:ChenBo
     * @DateTime 2018/12/20:14:25
     */
    public String authObjectOut(String json);


    /**
     * 数据写入接口
     * @Author:ChenBo
     * @DateTime 2018/12/20:14:27
     */
    public String writeObjectOut(String json);


    /**
     * 故障类数据写入接口
     * @Author:ChenBo
     * @DateTime 2018/12/20:14:28
     */
    public String writeFaultObjectOut (String json);


    /**
     * 心跳接口
     * @Author:ChenBo
     * @DateTime 2018/12/20:14:28
     */
    public String beatObjectOut(String json);


    /**
     * 获取交换识别码
     * @Author:ChenBo
     * @DateTime 2018/12/21:15:36
     */
    public  String getExchangeCode(String data,String jkYhm);

}
