package com.suneee.odb.model.reporting;

import lombok.Data;

/**
 * 鉴权数据包回执
 * @ClassName: MessageObjectResult
 * @Author: ChenBo
 * @DateTime: 2018/12/20:14:41
 */
@Data
public class MessageObjectResult {
    /** 交换类型 */
    private String exchangeType;
    /** 交换标识码 */
    private String exchangeCode;
    /** 相应数据时间 */
    private String responseTime;
    /** 消息 */
    private String message;
    /** 交换版本 */
    private String version;
}
