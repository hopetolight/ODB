
package com.suneee.odb.model.rocketmq;

import java.util.Date;

//终端消息基类
public  abstract class BaseDtuMessage implements DtuMessage {
	protected Integer msgId;  //消息流水号
	protected String dtuId;	  //终端编号	
	protected Date msgTime;   //消息报告时间

	public String getMsgTag() {
		return this.getClass().getSimpleName();
	}

	public String getMsgKey() {
		return ""+this.msgId;
	}

	public Integer getMsgId() {
		return msgId;
	}

	public void setMsgId(Integer msgId) {
		this.msgId = msgId;
	}

	public String getDtuId() {
		return dtuId;
	}

	public void setDtuId(String dtuId) {
		this.dtuId = dtuId;
	}

	public Date getMsgTime() {
		return msgTime;
	}

	public void setMsgTime(Date msgTime) {
		this.msgTime = msgTime;
	}
	public String toString(){
		return " ,BaseDtuMessage(msgId:"+msgId
				+",dtuId:"+dtuId
				+",msgTime:"+((msgTime==null)?"null":msgTime.toString())+")";
	}


}
