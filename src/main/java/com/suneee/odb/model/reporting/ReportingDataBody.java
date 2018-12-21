package com.suneee.odb.model.reporting;

import lombok.Data;

import java.io.Serializable;

/**
 * 上报数据模型
 *
 * @ClassName: ReportingDataBody
 * @Author: ChenBo
 * @DateTime: 2018/12/19:9:48
 */
@Data
public class ReportingDataBody implements Serializable {
    /** 设备编号 */
    private String SBBH;
    /** 采集时间 */
    private String SCSJ;
    /** 经度 */
    private String JD;
    /** 纬度 */
    private String WD;
    /** 环境温度 */
    private String HJWD;
    /** 大气压力 */
    private String DQYL;
    /** 车速 */
    private String CS;
    /** 总行驶里程 */
    private String ZXSLC;
    /** 油门踏板 */
    private String YMTB;
    /** 脚刹状态 */
    private String JSZT;
    /** 点火状态 */
    private String DHZT;
    /** MIL灯状态 */
    private String MDZT;
    /** 油箱液位 */
    private String YXYW;
    /** 进气歧管压力 */
    private String JQQGYL;
    /** 进气歧管温度 */
    private String JQQGWD;
    /** 机油压力 */
    private String JYYL;
    /**蓄电池电压*/
    private String XDCDY;
    /** 总油耗 */
    private String ZYH;
    /** 冷却液温度 */
    private String LQYWD;
    /** 进气流量 */
    private String JQLL;
    /** 瞬时油耗  */
    private String SSYH;
    /** 发动机扭矩模式
     * 0：超速失效
     * 1：转速控制
     * 2：扭矩控制
     * 3：转速/扭矩控制 */
    private String FDJNJMS="0";
    /** 实际扭矩百分比 */
    private String SJNJBFB;
    /**摩擦扭矩百分比*/
    private String MCNJBFB;
    /** 参考扭矩 */
    private String CKNJ;
    /** 发动机转速*/
    private String FDJZS;
    /** 发动机启动机模式 */
    private String FDJQDJMS;
    /** 发动机总运行时间 */
    private String FDJZYXSJ;
    /** 尿素箱液位（SCR）*/
    private String NSXYW;
    /** 尿素箱温度（SCR）*/
    private String NSXWD;
    /** 后处理下游氮氧浓度(SCR)*/
    private String HCLXYDYND;
    /** 后处理上游排气温度(SCR)*/
    private String HCLSYPQWD;
    /** 催化剂下游温度（SCR）*/
    private String CHJXYWD;
    /** 后处理露点状态（SCR）*/
    private String HCLLDZT;
    /** 尾管实时氮氧传感器露点状态（SCR）*/
    private String WGSSDYCGQLDZT;
    /** 泵工作状态 */
    private String BGZZT;
    /** 废气质量流量 */
    private String FQZLLL;
    /** 尾管实时氮氧浓度 */
    private String WGSSDYND;
}
