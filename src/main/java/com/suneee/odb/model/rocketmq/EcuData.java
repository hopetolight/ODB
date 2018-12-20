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
import java.util.List;

/**
 * 终端上报的工况数据
 * @Author: ChenBo
 * @DateTime: 2018/9/26:14:59
 */
public class EcuData extends BaseDtuMessage implements  Serializable {
	private static final long serialVersionUID = 1515880718788368310L;
	/** ECU版本ID */
	private Integer ecuVersionId;
	/** 采集流水号 */
	private Integer gatherFlowNo;
	/** 采集时间 */
	private Date gatherTime;
	/** 采集到的工况数据 */
	private List<Float> values;

	/** 采集到的工况数据状态
	 * 0:正常
	 * 1:信号异常
	 * 2:数据异常
	 * */
	private List<String> flags;

	public List<String> getFlags() {
		return flags;
	}

	public void setFlags(List<String> flags) {
		this.flags = flags;
	}

	public String getMsgTopic() {
		return Constants.MQ_TOPIC_ECU;
	}


	public Integer getEcuVersionId() {
		return ecuVersionId;
	}


	public void setEcuVersionId(Integer ecuVersionId) {
		this.ecuVersionId = ecuVersionId;
	}


	public Date getGatherTime() {
		return gatherTime;
	}

	public void setGatherTime(Date gatherTime) {
		this.gatherTime = gatherTime;
	}

	public List<Float> getValues() {
		return values;
	}

	public void setValues(List<Float> values) {
		this.values = values;
	}

	public Integer getGatherFlowNo() {
		return gatherFlowNo;
	}

	public void setGatherFlowNo(Integer gatherFlowNo) {
		this.gatherFlowNo = gatherFlowNo;
	}

	@Override
	public String toString () {
		final StringBuilder sb = new StringBuilder ("{");
		sb.append ("\"ecuVersionId\":")
				.append (ecuVersionId);
		sb.append (",\"gatherFlowNo\":")
				.append (gatherFlowNo);
		sb.append (",\"gatherTime\":\"")
				.append (gatherTime).append ('\"');
		sb.append (",\"values\":")
				.append (values);
		sb.append (",\"flags\":")
				.append (flags);
		sb.append ('}');
		return sb.toString ();
	}
}
