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
import java.util.Date;

//终端上报的工况数据
public class EcuDataSimple extends BaseDtuMessage implements  Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6816350842779702625L;
	
	private Date gatherTime;  //采集时间
	
	public EcuDataSimple(EcuData ed){
		this.gatherTime = ed.getGatherTime();
		this.dtuId = ed.getDtuId();
		this.msgId = ed.getMsgId();
		this.msgTime = ed.getMsgTime();
	}
	@Override
	public String getMsgTopic() {
		return Constants.MQ_TOPIC_ECU;
	}

	
	/**
	 * @return the gatherTime
	 */
	public Date getGatherTime() {
		return gatherTime;
	}

	/**
	 * @param gatherTime the gatherTime to set
	 */
	public void setGatherTime(Date gatherTime) {
		this.gatherTime = gatherTime;
	}


	public String toString(){
		return "EcuDataSimple(gatherTime:"+((gatherTime==null)?"null":gatherTime.toString())
				+super.toString()+")";
	}

}
