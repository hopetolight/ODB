package com.suneee.odb.model.rocketmq;


import com.suneee.odb.config.serializer.constant.Constants;

import java.io.Serializable;
import java.util.Date;

//终端流量告警
public class DtuFlowAlarm extends BaseDtuMessage implements Serializable {

	private static final long serialVersionUID = -5648375264675133108L;
	private Date alarmTime	;
	private Integer totalFlow	;
	private Integer usedFlow;
	private String alarmFlag	;

	public String toString(){
		return "DtuFlowAlarm(totalFlow:"+totalFlow
				+",usedFlow:"+usedFlow
				+",alarmFlag:"+alarmFlag
				+",alarmTime:"+((alarmTime==null)?"null":alarmTime.toString())
				+super.toString()+")";
	}
	
	@Override
	public String getMsgTopic() {
		return  Constants.MQ_TOPIC_NOTIFY;
	}

	public Date getAlarmTime() {
		return alarmTime;
	}

	public void setAlarmTime(Date alarmTime) {
		this.alarmTime = alarmTime;
	}

	public Integer getTotalFlow() {
		return totalFlow;
	}

	public void setTotalFlow(Integer totalFlow) {
		this.totalFlow = totalFlow;
	}

	public Integer getUsedFlow() {
		return usedFlow;
	}

	public void setUsedFlow(Integer usedFlow) {
		this.usedFlow = usedFlow;
	}

	public String getAlarmFlag() {
		return alarmFlag;
	}

	public void setAlarmFlag(String alarmFlag) {
		this.alarmFlag = alarmFlag;
	}


}
