package com.suneee.odb.model.rocketmq;


import com.suneee.odb.config.serializer.constant.Constants;

import java.io.Serializable;

/**
 * 终端主动上报的自身信息 :用于topic Notify consumer
 */
public class DtuInfo extends BaseDtuMessage implements  Serializable {

	private static final long serialVersionUID = 8831683913493728779L;

	private String ecuId;  //ECU ID
	
	private Integer ecuVersionId; //ECU版本ID
	private String  dtuSoftwareVersion; //终端软件版本
	private String  dtuSoftwareType;//终端软件类型

	@Override
	public String toString() {
		return "DtuInfo{" +
				"ecuId='" + ecuId + '\'' +
				", ecuVersionId=" + ecuVersionId +
				", dtuSoftwareVersion='" + dtuSoftwareVersion + '\'' +
				", dtuSoftwareType='" + dtuSoftwareType + '\'' +
				'}';
	}

	public DtuInfo(){
		
	}
	
	public String getMsgTopic() {
		return Constants.MQ_TOPIC_NOTIFY;
	}
	
	public String getEcuId() {
		return ecuId;
	}

	public void setEcuId(String ecuId) {
		this.ecuId = ecuId;
	}

	public Integer getEcuVersionId() {
		return ecuVersionId;
	}

	
	public void setEcuVersionId(Integer ecuVersionId) {
		this.ecuVersionId = ecuVersionId;
	}

	
	public String getDtuSoftwareVersion() {
		return dtuSoftwareVersion;
	}

	
	public void setDtuSoftwareVersion(String dtuSoftwareVersion) {
		this.dtuSoftwareVersion = dtuSoftwareVersion;
	}

	public String getDtuSoftwareType() {
		return dtuSoftwareType;
	}

	public void setDtuSoftwareType(String dtuSoftwareType) {
		this.dtuSoftwareType = dtuSoftwareType;
	}

}
