package com.suneee.odb.model.rocketmq;

import com.suneee.odb.config.serializer.constant.Constants;

import java.io.Serializable;
import java.util.Date;

//终端流量信息
public class DtuFlow extends BaseDtuMessage implements  Serializable {

	private static final long serialVersionUID = 1102066732562704027L;
	
	private Date statTime;           //流量统计时间
	private Integer flowTotalUsed;   //本月已用总流量
	private Integer flowCanUse;      //本月用户最大可用流量
	private Integer flowUserUsed;    //本月用户已用流量
	private Float alarmRate	;        //流量预警阀值
		

	public String toString(){
		return "DtuFlow(flowTotalUsed:"+flowTotalUsed
				+",flowCanUse:"+flowCanUse
				+",flowUserUsed:"+flowUserUsed
				+",alarmRate:"+alarmRate
				+",statTime:"+((statTime==null)?"null":statTime.toString())
				+super.toString()+")";
	}
	
	@Override
	public String getMsgTopic() {
		return Constants.MQ_TOPIC_NOTIFY;
	}

	public Date getStatTime() {
		return statTime;
	}

	public void setStatTime(Date statTime) {
		this.statTime = statTime;
	}

	public Integer getFlowTotalUsed() {
		return flowTotalUsed;
	}

	public void setFlowTotalUsed(Integer flowTotalUsed) {
		this.flowTotalUsed = flowTotalUsed;
	}

	public Integer getFlowCanUse() {
		return flowCanUse;
	}

	public void setFlowCanUse(Integer flowCanUse) {
		this.flowCanUse = flowCanUse;
	}

	public Integer getFlowUserUsed() {
		return flowUserUsed;
	}

	public void setFlowUserUsed(Integer flowUserUsed) {
		this.flowUserUsed = flowUserUsed;
	}

	public Float getAlarmRate() {
		return alarmRate;
	}

	public void setAlarmRate(Float alarmRate) {
		this.alarmRate = alarmRate;
	}
	

}
