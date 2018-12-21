package com.suneee.odb.util;

import com.suneee.odb.model.reporting.AuthObjectBody;
import com.suneee.odb.model.reporting.ReportingDataBody;
import com.suneee.odb.model.rocketmq.EcuData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @
 * @ClassName: SystemCache
 * @Author: ChenBo
 * @DateTime: 2018/12/20:11:48
 */
public class SystemCache {

    /** ECUData 数据接受队列 */
    private static final BlockingQueue<EcuData> ECU_DATA_QUEUE = new LinkedBlockingQueue<> ();
    /** 写入数据队列 */
    private static final BlockingQueue<ReportingDataBody> REPORTING_DATA_BODIES_QUEUE = new LinkedBlockingQueue<> ();
    /** 鉴权数据队列 */
    private static final BlockingQueue<AuthObjectBody> AUTH_OBJECT_BODIES_QUEUE = new LinkedBlockingQueue<> ();


    /**
     * 批量添加EcuData
     * @Author:ChenBo
     * @DateTime 2018/12/20:11:57
     */
    public static void addEcuDataList(List<EcuData> ecuDataList){
        ECU_DATA_QUEUE.addAll (ecuDataList);
    }


    public static EcuData getEcuData(){
        EcuData take = null;
        try {
            take = ECU_DATA_QUEUE.take ();
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        return take;
    }


    public static void addEcuData (EcuData ecudata) {
        try {
            ECU_DATA_QUEUE.put (ecudata);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
    }


    public static int getEcuSize(){
        return ECU_DATA_QUEUE.size ();
    }


    public static ReportingDataBody getReportingDataBody(){
        ReportingDataBody take = null;
        try {
            take = REPORTING_DATA_BODIES_QUEUE.take ();

        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        return  take;
    }


    public static void setReportingDataBody(ReportingDataBody reportingDataBody){
        try {
            REPORTING_DATA_BODIES_QUEUE.put (reportingDataBody);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
    }

    public static List<ReportingDataBody> getReportingDataBodyList(){
        ArrayList<ReportingDataBody> reportingDataBodyArrayList =null;
        int size = REPORTING_DATA_BODIES_QUEUE.size ();
        if (size>100){

            reportingDataBodyArrayList = new ArrayList<> (100);
            REPORTING_DATA_BODIES_QUEUE.drainTo (reportingDataBodyArrayList);
        }else if(size<100){
            reportingDataBodyArrayList = new ArrayList<> (size);
            REPORTING_DATA_BODIES_QUEUE.drainTo (reportingDataBodyArrayList);
        }
        return reportingDataBodyArrayList;
    }






    public static void setAuthObjectBody(AuthObjectBody authObjectBody){
        try {
            AUTH_OBJECT_BODIES_QUEUE.put (authObjectBody);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
    }


    public static List<AuthObjectBody> getAuthObjectBodyList(){
        ArrayList<AuthObjectBody> authObjectBodyArrayList =null;
        int size = AUTH_OBJECT_BODIES_QUEUE.size ();
        if (size>100){
            authObjectBodyArrayList = new ArrayList<> (100);
            AUTH_OBJECT_BODIES_QUEUE.drainTo (authObjectBodyArrayList);
        }else if(size<100){
            authObjectBodyArrayList = new ArrayList<> (size);
            AUTH_OBJECT_BODIES_QUEUE.drainTo (authObjectBodyArrayList);
        }
        return authObjectBodyArrayList;
    }
}
