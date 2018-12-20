package com.suneee.odb.model.rocketmq;


import com.suneee.odb.config.serializer.constant.Constants;

import java.io.Serializable;

//车辆当前限制状态反馈
public class DtuLimitStatusAck extends BaseDtuMessage implements  Serializable {
	private static final long serialVersionUID = -7518630503337566067L;
	
	private String limitStatus;  //当前限制：0 已解锁（即正常状态）、1一级限制、2二级限制、3三级限制、4已锁车
	
	public String toString(){
		return "DtuLimitStatusAck(limitStatus:"+limitStatus
				
				+super.toString()+")";
	}
	
	public DtuLimitStatusAck(){
		
	}

	public String getMsgTopic() {
		return Constants.MQ_TOPIC_NOTIFY;
	}

	public String getLimitStatus() {
		return limitStatus;
	}

	
	public void setLimitStatus(String limitStatus) {
		this.limitStatus = limitStatus;
	}

	
}
