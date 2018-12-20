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


//终端主动上报的报警(结束通知)
public class DtuAlarmEnd extends BaseDtuMessage implements  Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1045737177454798577L;
	private String alarmId;   //报警ID(主键，根据该ID更新结束时间)

	public DtuAlarmEnd() {		
	}
	
	public String getMsgTopic() {
		return Constants.MQ_TOPIC_NOTIFY;
	}

	public String getAlarmId() {
		return alarmId;
	}

	public void setAlarmId(String alarmId) {
		this.alarmId = alarmId;
	}
	
	
	
}
