package com.suneee.odb.model.httpclient;

import com.alibaba.fastjson.JSONObject;

/**
 * Http通用返回结果
 * @ClassName: HttpResult
 * @Author: ChenBo
 * @DateTime: 2018/11/6:11:24
 */
public class HttpResult {

    private Integer statsu;

    private String data;

    public HttpResult (Integer statsu, String data) {
        this.statsu = statsu;
        this.data = data;
    }


    /**
     * 获取
     * @return statsu
     */
    public Integer getStatsu() {
        return this.statsu;
    }

    /**
     * 设置
     * @param statsu
     */
    public void setStatsu(Integer statsu) {
        this.statsu = statsu;
    }

    /**
     * 获取
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(String data) {
        this.data = data;
    }


    /**
     * 获取JSON对象数据
     * @return
     */
    public JSONObject getJSONObject(){
        if (!data.trim().isEmpty()){
            return JSONObject.parseObject(data);
        }else {
            return null;
        }
    }


}
