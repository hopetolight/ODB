package com.suneee.odb.model.reporting;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @
 * @ClassName: AuthObject
 * @Author: ChenBo
 * @DateTime: 2018/12/19:16:16
 */
@Data
public class AuthObject implements Serializable {
    /** 交换类型 */
    private String exchangeType;
    /** 交换标识码 */
    private String exchangeCode;
    /** 请求数据时间 */
    private String requestTime;
    /** 数据体 */
    private List<Object> body;
    /** 交换版本 */
    private String version;

    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder ("{");
        sb.append ("\"exchangeType\":\"")
                .append (exchangeType).append ('\"');
        sb.append (",\"exchangeCode\":\"")
                .append (exchangeCode).append ('\"');
        sb.append (",\"requestTime\":\"")
                .append (requestTime).append ('\"');
        sb.append (",\"body\":")
                .append (body);
        sb.append (",\"version\":\"")
                .append (version).append ('\"');
        sb.append ('}');
        return sb.toString ();
    }
}
