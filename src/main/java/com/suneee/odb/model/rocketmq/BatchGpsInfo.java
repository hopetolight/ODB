package com.suneee.odb.model.rocketmq;


import com.suneee.odb.config.serializer.constant.Constants;

import java.io.Serializable;
import java.util.List;

/**
 * 批量上报定位信息
 * 
 * wjf
 * 2016-7-25-11:18:33
 */
public class BatchGpsInfo implements DtuMessage, Serializable {

	private static final long serialVersionUID = 3114251785095404418L;
	List<GpsInfo> gpsInfo;
	
	public String getMsgTopic() {
		return Constants.MQ_TOPIC_GPS;
	}

	public String getMsgTag() {
		
		return BatchGpsInfo.class.getSimpleName();
	}

	public String getMsgKey() {
		
		return "" + System.currentTimeMillis();
	}

	public List<GpsInfo> getGpsInfo() {
		return gpsInfo;
	}

	public void setGpsInfo(List<GpsInfo> gpsInfo) {
		this.gpsInfo = gpsInfo;
	}


}
