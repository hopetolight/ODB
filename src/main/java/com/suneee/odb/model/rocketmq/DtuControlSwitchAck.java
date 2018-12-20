package com.suneee.odb.model.rocketmq;


import com.suneee.odb.config.serializer.constant.Constants;

import java.io.Serializable;

//终端控制模块启停结果反馈
public class DtuControlSwitchAck extends BaseDtuMessage implements  Serializable{
	
	private static final long serialVersionUID = -6057881831664767531L;
	
	public final static String DTU_USE_TAMPER = "0";  //启用防拆
	public final static String DTU_USE_BIND = "1";    //启用绑定
	public final static String DTU_UNUSE_TAMPER = "2";//解除防拆
	public final static String DTU_UNUSE_BIND = "3";  //解除绑定
	
	private String control;  //控制模块
	private String result;   //结果
	
	public String toString(){
		return "DtuControlSwitchAck(control:"+control
				+",result:"+result
				
				+super.toString()+")";
	}
	
	public DtuControlSwitchAck(){
		
	}
	
	public String getMsgTopic() {
		return Constants.MQ_TOPIC_NOTIFY;
	}

	public String getControl() {
		return control;
	}

	public void setControl(String control) {
		this.control = control;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}


	
	
}
