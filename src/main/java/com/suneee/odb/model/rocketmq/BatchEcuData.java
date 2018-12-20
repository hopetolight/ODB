package com.suneee.odb.model.rocketmq;


import com.suneee.odb.config.serializer.constant.Constants;

import java.io.Serializable;
import java.util.List;

/**
 * 批量上报工况信息
 * 
 * wjf
 * 2016-7-25-11:18:33
 */
public class BatchEcuData implements DtuMessage, Serializable {

	private static final long serialVersionUID = -6254829625535591323L;
	List<EcuData> ecuDatas;
	
	public String getMsgTopic() {
		return Constants.MQ_TOPIC_ECU;
	}

	public String getMsgTag() {
		
		return BatchEcuData.class.getSimpleName();
	}

	public String getMsgKey() {
		
		return "" + System.currentTimeMillis();
	}

	public List<EcuData> getEcuDatas() {
		return ecuDatas;
	}

	public void setEcuDatas(List<EcuData> ecuDatas) {
		this.ecuDatas = ecuDatas;
	}

}
