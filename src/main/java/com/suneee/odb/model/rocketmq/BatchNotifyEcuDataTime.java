/**********************************************************************
 *                                                                  *
 * Copyright(C) 2015  suneee         http://www.suneee.com/         *
 * Limited. All rights reserved.               						*
 *                                                                  *
 * The software is developed by suneeeT nanning center.       		*
 * Using, reproducing,modification and distribution                 *
 * are prohibited without suneee's permission.                      *                  		
 *                                                                  *
 *********************************************************************/
package com.suneee.odb.model.rocketmq;


import com.suneee.odb.config.serializer.constant.Constants;

import java.io.Serializable;
import java.util.List;

/**
 * 批量通知工况最新更新时间（用于平台内部通知）
 * 
 * djc
 * 2017-8-11-11:18:33
 */
public class BatchNotifyEcuDataTime implements DtuMessage, Serializable {

	private static final long serialVersionUID = -6254829625535591323L;
	List<EcuDataSimple> ecuDatas;

	@Override
	public String getMsgTopic() {
		return Constants.MQ_TOPIC_NOTIFY;
	}

	@Override
	public String getMsgTag() {

		return BatchNotifyEcuDataTime.class.getSimpleName();
	}

	@Override
	public String getMsgKey() {

		return "" + System.currentTimeMillis();
	}

	public List<EcuDataSimple> getEcuDatas() {
		return ecuDatas;
	}

	public void setEcuDatas(List<EcuDataSimple> ecuDatas) {
		this.ecuDatas = ecuDatas;
	}

}
