package com.suneee.odb.config.system.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 系统配置文件实体
 * @ClassName: SystemProperties
 * @Author: ChenBo
 * @DateTime: 2018/12/20:15:28
 */
@ConfigurationProperties(prefix = "spring.obd")
@Data
public class SystemProperties {
    /** 接口用户名 */
    private String jkYhm;
    /** 接口授权码 */
    private String jkSqm;
    /** 交换类型  */
    private String exchangeType;
    /** 交换标识码  */
    private String exchangeCode;
    /** 交换版本 */
    private String version;
    /** 鉴权接口地址 */
    private String authUrl;
    /** 写入数据接口地址 */
    private String writeUrl;
    /** 写入故障接口地址 */
    private String faultUrl;
    /** 心跳接口地址 */
    private String beatUrl;
    /** 加密串 */
    private String keyStr;
    /** 心跳时间 */
    private Integer beatTime;
}
