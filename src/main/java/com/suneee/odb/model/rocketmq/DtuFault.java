package com.suneee.odb.model.rocketmq;


import com.suneee.odb.config.serializer.constant.Constants;

import java.io.Serializable;
import java.util.Date;

//终端主动上报的故障信息
public class DtuFault extends BaseDtuMessage implements  Serializable {

	private static final long serialVersionUID = -2234077675066325779L;

	private String spn_code; //SPN码值
	private String fmi_code; //FMI码值
	private Integer fault_count;  //该故障的发生次数
	private Date  fault_time;

	public String toString(){
		return "DtuFault(spn_code:"+spn_code
				+",fmi_code:"+fmi_code
				+",fault_count:"+((fault_count==null)?"null":fault_count.toString())
				+",fault_time:"+((fault_time==null)?"null":fault_time.toString())
				
				+super.toString()+")";
	}
	
	public DtuFault(){
		
	}

	public String getMsgTopic() {
		return Constants.MQ_TOPIC_NOTIFY;
	}
	
	public Integer getFault_count() { 
		return fault_count;
	}

	public void setFault_count(Integer fault_count) {
		this.fault_count = fault_count;
	}



	public String getFmi_code() {
		return fmi_code;
	}

	public void setFmi_code(String fmi_code) {
		this.fmi_code = fmi_code;
	}


	public String getSpn_code() {
		return spn_code;
	}

	public void setSpn_code(String spn_code) {
		this.spn_code = spn_code;
	}

	/**
	 * @return the fault_time
	 */
	public Date getFault_time() {
		return fault_time;
	}

	/**
	 * @param fault_time the fault_time to set
	 */
	public void setFault_time(Date fault_time) {
		this.fault_time = fault_time;
	}



}
