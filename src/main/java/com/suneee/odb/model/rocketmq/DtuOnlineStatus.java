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

//终端在线状态
public class DtuOnlineStatus extends BaseDtuMessage implements  Serializable {
	
	private static final long serialVersionUID = -8340922396663167677L;
	private Boolean isOnline; //是否在线
	
	public String toString(){
		return "DtuOnlineStatus(isOnline:"+isOnline
				
				+super.toString()+")";
	}
	
	public DtuOnlineStatus(){
		
	}

	public String getMsgTopic() {
		return Constants.MQ_TOPIC_NOTIFY;
	}
	
		
	public Boolean getIsOnline() {
		return isOnline;
	}

	public void setIsOnline(Boolean isOnline) {
		this.isOnline = isOnline;
	}
	
}
