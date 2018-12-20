package com.suneee.odb.config.httpclient.service;

import com.suneee.odb.model.httpclient.HttpResult;

import java.util.Map;

/**
 *  第三方接口调用接口
 * @ClassName: HttpAPIService
 * @Author: ChenBo
 * @DateTime: 2018/11/6:11:45
 */
public interface HttpAPIService {

    /**
     * GET 请求
     * @Author:ChenBo
     * @DateTime 2018/11/6:11:52
     * @param url  get请求url
     */
    HttpResult doGet(String url);


    /**
     * GET 请求 带参数
     * @Author:ChenBo
     * @DateTime 2018/11/6:11:52
     * @param url  get请求url
     * @param paramMap get请求参数
     */
    public HttpResult doGet(String url, Map<String, Object> paramMap);


    /**
     * POST 请求 带参数
     * @Author:ChenBo
     * @DateTime 2018/11/6:14:52
     */
    public HttpResult doPost(String url, String jsonString);


}
