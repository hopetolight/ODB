/**********************************************************************
 *                                                                  *
 * Copyright(C) 2015  suneee         http://www.suneee.com/         *
 * Limited. All rights reserved.               						*
 *                                                                  *
 * The software is developed by suneeeT nanning center.       		*
 * Using, reproducing,modification and distribution                 *
 * are prohibited without suneee's permission.                      *                  		
 *                                                                  *
 *********************************************************************/
package com.suneee.odb.model.rocketmq;


import com.suneee.odb.config.serializer.constant.Constants;

import java.io.Serializable;

//终端防拆|绑定 的启停结果反馈
public class DtuBindAck extends BaseDtuMessage implements  Serializable{
	private static final long serialVersionUID = 6421453083135646156L;
	
	public final static String DTU_USE_TAMPER = "0";  //启用防拆
	public final static String DTU_USE_BIND = "1";    //启用绑定
	public final static String DTU_UNUSE_TAMPER = "2";//解除防拆
	public final static String DTU_UNUSE_BIND = "3";  //解除绑定
	
	
	private String cmdFlag;  //命令标识
	private String result;   //结果
	
	public String toString(){
		return "DtuBindAck(cmdFlag:"+cmdFlag
				+",result:"+result
				
				+super.toString()+")";
	}
	
	public DtuBindAck(){
		
	}
	
	public String getMsgTopic() {
		return Constants.MQ_TOPIC_NOTIFY;
	}
	
	public String getCmdFlag() {
		return cmdFlag;
	}
	
	public void setCmdFlag(String cmdFlag) {
		this.cmdFlag = cmdFlag;
	}
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
 
	
}
