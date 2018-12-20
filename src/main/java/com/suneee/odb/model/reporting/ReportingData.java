package com.suneee.odb.model.reporting;

import lombok.Data;

import java.io.Serializable;

/**
 * 上报数据模型
 *
 * @ClassName: ReportingData
 * @Author: ChenBo
 * @DateTime: 2018/12/19:9:48
 */
@Data
public class ReportingData implements Serializable {
    /** 设备编号 */
    private String SBBH;
    /** 上传时间 */
    private String SCSJ;
    /** 经度 */
    private String JD;
    /** 纬度 */
    private String WD;
    /** 大气压力 */
    private String DQYL;
    /** 车速 */
    private String CS;
    /** 总行驶里程 */
    private String ZXSLC;
    /** 油门踏板 */
    private String YMTB;
    /** MIL灯状态 */
    private String MDZT;
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
    /** 瞬时油耗  */
    private String SSYH;
    /** 发动机扭矩模式 */
    private String FDJNJMS;
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

    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder ("{");
        sb.append ("\"SBBH\":\"")
                .append (SBBH).append ('\"');
        sb.append (",\"SCSJ\":\"")
                .append (SCSJ).append ('\"');
        sb.append (",\"JD\":\"")
                .append (JD).append ('\"');
        sb.append (",\"WD\":\"")
                .append (WD).append ('\"');
        sb.append (",\"DQYL\":\"")
                .append (DQYL).append ('\"');
        sb.append (",\"CS\":\"")
                .append (CS).append ('\"');
        sb.append (",\"ZXSLC\":\"")
                .append (ZXSLC).append ('\"');
        sb.append (",\"YMTB\":\"")
                .append (YMTB).append ('\"');
        sb.append (",\"MDZT\":\"")
                .append (MDZT).append ('\"');
        sb.append (",\"JQQGYL\":\"")
                .append (JQQGYL).append ('\"');
        sb.append (",\"JQQGWD\":\"")
                .append (JQQGWD).append ('\"');
        sb.append (",\"JYYL\":\"")
                .append (JYYL).append ('\"');
        sb.append (",\"XDCDY\":\"")
                .append (XDCDY).append ('\"');
        sb.append (",\"ZYH\":\"")
                .append (ZYH).append ('\"');
        sb.append (",\"LQYWD\":\"")
                .append (LQYWD).append ('\"');
        sb.append (",\"SSYH\":\"")
                .append (SSYH).append ('\"');
        sb.append (",\"FDJNJMS\":\"")
                .append (FDJNJMS).append ('\"');
        sb.append (",\"SJNJBFB\":\"")
                .append (SJNJBFB).append ('\"');
        sb.append (",\"MCNJBFB\":\"")
                .append (MCNJBFB).append ('\"');
        sb.append (",\"CKNJ\":\"")
                .append (CKNJ).append ('\"');
        sb.append (",\"FDJZS\":\"")
                .append (FDJZS).append ('\"');
        sb.append (",\"FDJQDJMS\":\"")
                .append (FDJQDJMS).append ('\"');
        sb.append (",\"FDJZYXSJ\":\"")
                .append (FDJZYXSJ).append ('\"');
        sb.append (",\"NSXYW\":\"")
                .append (NSXYW).append ('\"');
        sb.append (",\"NSXWD\":\"")
                .append (NSXWD).append ('\"');
        sb.append (",\"HCLXYDYND\":\"")
                .append (HCLXYDYND).append ('\"');
        sb.append (",\"HCLSYPQWD\":\"")
                .append (HCLSYPQWD).append ('\"');
        sb.append (",\"CHJXYWD\":\"")
                .append (CHJXYWD).append ('\"');
        sb.append (",\"HCLLDZT\":\"")
                .append (HCLLDZT).append ('\"');
        sb.append (",\"WGSSDYCGQLDZT\":\"")
                .append (WGSSDYCGQLDZT).append ('\"');
        sb.append (",\"BGZZT\":\"")
                .append (BGZZT).append ('\"');
        sb.append (",\"FQZLLL\":\"")
                .append (FQZLLL).append ('\"');
        sb.append (",\"WGSSDYND\":\"")
                .append (WGSSDYND).append ('\"');
        sb.append ('}');
        return sb.toString ();
    }
}
