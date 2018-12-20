package com.suneee.odb.config.httpclient;

import com.suneee.odb.config.httpclient.properties.PropertiesConfiguration;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

/**
 * HttpClient 第三方接口调用配置
 * @ClassName: HttpClientConfiguration
 * @Author: ChenBo
 * @DateTime: 2018/11/6:10:57
 */
@SpringBootConfiguration
@EnableConfigurationProperties(PropertiesConfiguration.class)
public class HttpClientConfiguration {

    @Autowired
    private PropertiesConfiguration properties;


    /**
     * 初始化连接池管理器
     * 设置最大连接数据和最大并发数
     * @Author:ChenBo
     * @DateTime 2018/11/6:11:01
     */
    @Bean(name = "httpClientConnectionManager")
    public PoolingHttpClientConnectionManager getHttpClientConnectionManager() throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {

        SSLContextBuilder builder = new SSLContextBuilder();
        builder.loadTrustMaterial(null, new TrustSelfSignedStrategy());
        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
                builder.build());
        Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create
                ().register(
                "http", PlainConnectionSocketFactory.getSocketFactory()).register(
                "https", sslsf).build();
        PoolingHttpClientConnectionManager httpClientConnectionManager =new PoolingHttpClientConnectionManager(socketFactoryRegistry);
        httpClientConnectionManager.setMaxTotal(properties.getMaxTotal()); //设置最大连接数据
        httpClientConnectionManager.setDefaultMaxPerRoute(properties.getMaxPerRoute()); //设置最大并发数
        return httpClientConnectionManager;
    }

    
    /**
     * 实例化连接池,设置连接池管理器
     * @Author:ChenBo
     * @DateTime 2018/11/6:11:05
     */
    @Bean(name = "httpClientBuilder")
    public HttpClientBuilder getHttpClientBuilder(
            @Qualifier("httpClientConnectionManager")PoolingHttpClientConnectionManager httpClientConnectionManager ){
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        httpClientBuilder.setConnectionManager(httpClientConnectionManager); //设置连接池管理器
        return httpClientBuilder;
    }

    /**
     * 注入连接池,用于获取HttpClient
     * @Author:ChenBo
     * @DateTime 2018/11/6:11:08
     */
    @Bean(name = "httpClient")
    public CloseableHttpClient getCloseableHttpClient(
            @Qualifier("httpClientBuilder") HttpClientBuilder httpClientBuilder){
        return httpClientBuilder.build();
    }


    /**
     * Builder 是RequestConfig 内部类
     * 设置Builder的连接信息
     * 这里可以设置 proxy cookieSpec 等属性
     * @Author:ChenBo
     * @DateTime 2018/11/6:11:20
     */
    @Bean(name = "requestConfigBuilder")
    public RequestConfig.Builder getRequestConfigBuilder(){
        RequestConfig.Builder builder = RequestConfig.custom(); //获取内部类对象
        builder.setConnectTimeout(properties.getConnectTimeout()) //设置连接超时时间
                .setConnectionRequestTimeout(properties.getConnectionRequestTimeout()) //设置从连接池中获取连接时间
                .setSocketTimeout(properties.getSocketTimeout()); //设置数据传输时间
        return builder;
    }


    /**
     * 通过builder 获取RequestConfig
     * @Author:ChenBo
     * @DateTime 2018/11/6:11:21
     */
    @Bean(name = "requestConfig")
    public RequestConfig getRequestConfig(
            @Qualifier("requestConfigBuilder") RequestConfig.Builder builder){
        return builder.build();
    }

}

