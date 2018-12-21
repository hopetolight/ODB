package com.suneee.odb.model.reporting;

import lombok.Data;

import java.io.Serializable;

/**
 * @
 * @ClassName: AuthObjectBody
 * @Author: ChenBo
 * @DateTime: 2018/12/20:14:17
 */
@Data
public class AuthObjectBody implements Serializable {

    /** 号牌种类 */
    private String HPZL;
    /** 车牌号 */
    private String HPHM;
    /** 车辆型号 */
    private String CLXH;
    /** CLPP */
    private String CLPP;
    /** 车架号 */
    private String CLSBHM;
    /** 发动机号 */
    private String FDJH;
    /** CCDJRQ */
    private String CCDJRQ;
    /** 发动机型号 */
    private String FDJXH;
    /** 燃料种类 */
    private String RLZL;
    /** 车辆类型 */
    private String CLLX;
    /** 所有人(车主) */
    private String SYR;
    /** 联系电话 */
    private String LXDH;
    /** 设备编号 */
    private String SBBH;

}
