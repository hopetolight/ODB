package com.suneee.odb.model.rocketmq;


import com.suneee.odb.config.serializer.constant.Constants;

import java.io.Serializable;
import java.util.List;

/**
 * 批量通知定位信息（用于平台内部通知）
 * 
 * djc
 * 2017-8-11-11:18:33
 */
public class BatchNotifyGpsInfo implements DtuMessage, Serializable {

	private static final long serialVersionUID = 3114251785095404418L;
	List<GpsInfoSimple> gpsInfo;

	@Override
	public String getMsgTopic() {
		return Constants.MQ_TOPIC_NOTIFY;
	}

	@Override
	public String getMsgTag() {

		return BatchNotifyGpsInfo.class.getSimpleName();
	}

	@Override
	public String getMsgKey() {

		return "" + System.currentTimeMillis();
	}

	public List<GpsInfoSimple> getGpsInfo() {
		return gpsInfo;
	}

	public void setGpsInfo(List<GpsInfoSimple> gpsInfo) {
		this.gpsInfo = gpsInfo;
	}

}
