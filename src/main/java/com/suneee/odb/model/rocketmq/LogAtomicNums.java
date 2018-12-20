package com.suneee.odb.model.rocketmq;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

public class LogAtomicNums {
    public static  String Today = DateFormatUtils.format(new Date(),"yyyy-MM-dd");
    public static volatile boolean incrFlag = true;
    public static AtomicLong totalNum = new AtomicLong(0);//一共接收的数据量

    public static AtomicLong dropNum = new AtomicLong(0);
    //不合法数据量
    public static AtomicLong sendNum = new AtomicLong(0);
    //发送总量
    public static AtomicLong sendSuccessNum = new AtomicLong(0);
    //发送成功总量

    public static void incrTotal(long size){
        while(!incrFlag){
        }
        totalNum.addAndGet(size);
    }

    public static void incrDrop(long size){
        while(!incrFlag){
        }
        dropNum.addAndGet(size);
    }

    public static void incrSend(long size){
        while(!incrFlag){
        }
        sendNum.addAndGet(size);
    }

    public static void incrSendSuccess(long size){
        while(!incrFlag){
        }
        sendSuccessNum.addAndGet(size);
    }

    public static void reset(){
        Today = DateFormatUtils.format(new Date(),"yyyy-MM-dd");
        incrFlag=false;
        totalNum.set(0);
        dropNum.set(0);
        sendNum.set(0);
        sendSuccessNum.set(0);
        incrFlag=true;
    }
}
