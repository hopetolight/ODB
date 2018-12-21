package com.suneee.odb.config.httpclient.service.impl;

import com.suneee.odb.config.httpclient.service.HttpAPIService;
import com.suneee.odb.model.httpclient.HttpResult;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 第三方接口调用实现
 * @ ClassName: HttpAPIServiceImpl
 * @ Author: ChenBo
 * @ DateTime: 2018/11/6:11:46
 */
@Service
public class HttpAPIServiceImpl implements HttpAPIService {

    private final CloseableHttpClient closeableHttpClient;

    private final RequestConfig config;

    @Autowired
    public HttpAPIServiceImpl (CloseableHttpClient closeableHttpClient, RequestConfig config) {
        this.closeableHttpClient = closeableHttpClient;
        this.config = config;
    }


    /**
     * GET 请求
     * @param url get请求url
     * @ Author:ChenBo
     * @ DateTime 2018/11/6:11:52
     */
    @Override
    public HttpResult doGet(String url) {
        HttpResult httpResult =null;
        try {
            HttpGet httpGet = new HttpGet(url);
            httpGet.setConfig(config);
            CloseableHttpResponse response = closeableHttpClient.execute(httpGet);
            if (response.getStatusLine().getStatusCode()==HttpStatus.SC_OK){
                String s = EntityUtils.toString(response.getEntity(), "UTF-8");
                httpResult = new HttpResult(HttpStatus.SC_OK,s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return httpResult;
    }

    /**
     * GET 请求
     * @ param url get请求url
     * @ Author: ChenBo
     * @ DateTime 2018/11/6:11:52
     */
    @Override
    public HttpResult doGet(String url, Map<String, Object> paramMap) {
        HttpResult httpResult =null;
        try {
            URIBuilder uriBuilder =new URIBuilder(url);
            if (paramMap!=null){
                for (Map.Entry<String, Object> entry:paramMap.entrySet()){
                    uriBuilder.setParameter(entry.getKey(),entry.getValue().toString());
                }
            }
            httpResult = this.doGet(uriBuilder.build().toString());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return httpResult;
    }

    /**
     * POST 请求 带参数
     * @ param url
     * @ param jsonString
     * @ Author:ChenBo
     * @ DateTime 2018/11/6:14:52
     */
    @Override
    public HttpResult doPost(String url, String jsonString) {
        HttpResult httpResult =null;
        try {
            HttpPost httpPost = new HttpPost(url);
            httpPost.setConfig(config);
            if (!StringUtils.isBlank(jsonString)){
                httpPost.setEntity(new StringEntity(jsonString,"UTF-8"));
            }
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-Type", "application/json");
            CloseableHttpResponse response = closeableHttpClient.execute(httpPost);
            if (response.getStatusLine().getStatusCode()== HttpStatus.SC_OK){
                httpResult = new HttpResult(HttpStatus.SC_OK, EntityUtils.toString(response.getEntity()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return httpResult;
    }

    /**
     * POST 请求 带 key-value 参数
     *
     * @param url
     * @param paramMap
     * @Author:ChenBo
     * @DateTime 2018/11/6:14:52
     */
    @Override
    public HttpResult doPost (String url, Map<String, String> paramMap) {
        HttpResult httpResult =null;
        List<NameValuePair> formParamList=new LinkedList<> ();
        try {
            HttpPost httpPost = new HttpPost(url);
            httpPost.setConfig(config);
            httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded");
            for(Map.Entry<String,String> paramEntry : paramMap.entrySet ()){
                BasicNameValuePair param= new BasicNameValuePair(paramEntry.getKey (),paramEntry.getValue ());
                formParamList.add (param);
            }
            if (formParamList.size ()>0){
                httpPost.setEntity(new UrlEncodedFormEntity (formParamList,"UTF-8"));
            }

            CloseableHttpResponse response = closeableHttpClient.execute(httpPost);
            if (response.getStatusLine().getStatusCode()== HttpStatus.SC_OK){
                httpResult = new HttpResult(HttpStatus.SC_OK, EntityUtils.toString(response.getEntity()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return httpResult;
    }


}
