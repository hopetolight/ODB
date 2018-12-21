package com.suneee.odb.service.impl;

import com.suneee.odb.model.reporting.AuthObjectBody;
import com.suneee.odb.model.reporting.ReportingDataBody;
import com.suneee.odb.model.rocketmq.EcuData;
import com.suneee.odb.service.AssemblyData;
import com.suneee.odb.util.SystemCache;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 组装数据服务
 * @ClassName: AssemblyDataImpl
 * @Author: ChenBo
 * @DateTime: 2018/12/21:11:41
 */
@Slf4j
@Service
public class AssemblyDataImpl implements AssemblyData {


    public void reportingDarta(){
        EcuData ecuData = SystemCache.getEcuData ();
        Date gatherTime = ecuData.getGatherTime ();
        String dtuId = ecuData.getDtuId ();
        List<Float> values = ecuData.getValues ();
        ReportingDataBody reportingDataBody = new ReportingDataBody ();
        reportingDataBody.setSBBH (dtuId); //设备编号
        reportingDataBody.setSCSJ (new SimpleDateFormat("yyyyMMddHH24mmss").format (gatherTime)); //上报时间
        setValues (values, reportingDataBody);
        SystemCache.setReportingDataBody (reportingDataBody);
    }




    public void authData(){
        AuthObjectBody authObjectBody = new AuthObjectBody ();
        authObjectBody.setSBBH ("973790003831"); //终端编号
        authObjectBody.setHPZL ("15"); //号牌种类
        authObjectBody.setHPHM ("桂V03831"); //号牌号码
        authObjectBody.setCLPP ("bzd"); //车辆品牌
        authObjectBody.setCLSBHM ("1123sadfdaafdda"); //车架号
        authObjectBody.setFDJH ("sdf23adfspojifds"); //发动机号
        authObjectBody.setCCDJRQ (new SimpleDateFormat("yyyyMMddHHmmss").format (new Date ()));
        authObjectBody.setFDJXH ("ewdsacex"); //发动机型号
        authObjectBody.setRLZL ("B11"); //燃料类型
        authObjectBody.setCLXH ("bzd");  //车辆型号
        authObjectBody.setCLLX ("B11"); //车辆类型
        authObjectBody.setSYR ("bzd"); //所有人
        authObjectBody.setLXDH ("15502299033"); //联系电话
        SystemCache.setAuthObjectBody (authObjectBody);
    }




    private void setValues ( List<Float> values, ReportingDataBody reportingDataBody) {
        if (values != null && values.size ()==32){
            reportingDataBody.setDQYL (String.valueOf (values.get (0)));//大气压力
            reportingDataBody.setCS (String.valueOf (values.get (1))); //车速
            reportingDataBody.setZXSLC (String.valueOf (values.get (2))); //总行驶里程
            reportingDataBody.setYMTB (String.valueOf (values.get (3))); //油门踏板
            reportingDataBody.setMDZT (String.valueOf (values.get (4))); //MIL灯状态
            reportingDataBody.setJQQGYL (String.valueOf (values.get (5))); //进气歧管压力
            reportingDataBody.setJQQGWD (String.valueOf (values.get (6))); //进气歧管温度
            reportingDataBody.setJYYL (String.valueOf (values.get (7))); //机油压力
            reportingDataBody.setXDCDY (String.valueOf (values.get (8))); //蓄电池电压
            reportingDataBody.setZYH (String.valueOf (values.get (9))); //总油耗
            reportingDataBody.setLQYWD (String.valueOf (values.get (10))); //冷却液温度
            reportingDataBody.setSSYH (String.valueOf (values.get (11))); //瞬时油耗
            reportingDataBody.setFDJNJMS (String.valueOf (values.get (12))); //发动机扭矩模式
            reportingDataBody.setSJNJBFB (String.valueOf (values.get (13))); //实际扭矩百分比
            reportingDataBody.setMCNJBFB (String.valueOf (values.get (14))); //摩擦扭矩百分比
            reportingDataBody.setCKNJ (String.valueOf (values.get (15))); //参考扭矩
            reportingDataBody.setFDJZS (String.valueOf (values.get (17))); //发动机转速
            reportingDataBody.setFDJQDJMS (String.valueOf (values.get (18))); //发动机启动机模式
            reportingDataBody.setFDJZYXSJ (String.valueOf (values.get (19))); //发动机总运行时间
            reportingDataBody.setNSXYW (String.valueOf (values.get (20))); //尿素箱液位（SCR）
            reportingDataBody.setNSXWD (String.valueOf (values.get (21))); //尿素箱温度（SCR）
            reportingDataBody.setHCLXYDYND (String.valueOf (values.get (22))); //后处理下游氮氧浓度(SCR)
            reportingDataBody.setHCLSYPQWD (String.valueOf (values.get (23))); //后处理上游排气温度(SCR)
            reportingDataBody.setCHJXYWD (String.valueOf (values.get (24))); //催化剂下游温度（SCR）
            reportingDataBody.setHCLLDZT (String.valueOf (values.get (25))); //后处理露点状态（SCR）
            reportingDataBody.setWGSSDYCGQLDZT (String.valueOf (values.get (26))); //尾管实时氮氧传感器露点状态（SCR）
            reportingDataBody.setBGZZT (String.valueOf (values.get (27))); //泵工作状态
            reportingDataBody.setFQZLLL (String.valueOf (values.get (28))); //废气质量流量
            reportingDataBody.setWGSSDYND (String.valueOf (values.get (29))); //尾管实时氮氧浓度
            reportingDataBody.setJD (String.valueOf (values.get (30)));
            reportingDataBody.setWD (String.valueOf (values.get (31)));
            reportingDataBody.setBGZZT (String.valueOf (values.get (32)));
        }
    }
}
