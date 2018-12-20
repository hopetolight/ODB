package com.suneee.odb.config.httpclient.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 第三方接口调用配置
 * @ClassName: PropertiesConfiguration
 * @Author: ChenBo
 * @DateTime: 2018/11/6:10:47
 */
@ConfigurationProperties(prefix = "spring.httpclient")
@Data
public class PropertiesConfiguration {

    /** 最大连接数 */
    private Integer maxTotal = 100;

    /** 最大并发数 */
    private Integer maxPerRoute = 20;

    /** 连接存活时间 */
    private Integer connectTimeout= 1000;

    /** 从连接池获取连接最长时间 */
    private Integer connectionRequestTimeout = 500;

    /** 数据传输的最长时间 */
    private Integer socketTimeout = 1000000;

    /** 提交请求前世是否测试 */
    private Boolean staleConnectionCheckEnabled = true;

}
