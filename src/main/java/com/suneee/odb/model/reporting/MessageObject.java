package com.suneee.odb.model.reporting;

import lombok.Data;

import java.io.Serializable;

/**
 * @
 * @ClassName: MessageObject
 * @Author: ChenBo
 * @DateTime: 2018/12/20:15:11
 */
@Data
public abstract class MessageObject implements Serializable {

    /** 交换类型 */
    protected String exchangeType;
    /** 交换标识码 */
    protected String exchangeCode;
    /** 请求数据时间 */
    protected String requestTime;
    /** 交换版本 */
    protected String version;
}
