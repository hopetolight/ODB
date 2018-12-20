package com.suneee.odb.model.rocketmq;

import java.io.Serializable;

//终端主动上报的报警
public class FaultAlarmCancel extends BaseSmsReplyMessage implements  Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4289910633030580329L;
	
	private String carNo;			//车牌号
	
	public String toString(){
		return "FaultAlarmCancel(carNo:"+carNo +super.toString()+")";
	}
	
	public FaultAlarmCancel() {		
	}
	
	@Override
	public String getMsgTag() {		
		return FaultAlarmCancel.class.getSimpleName();
	}
	
	public FaultAlarmCancel(BaseSmsReplyMessage bsrm) {		
		this.setDtuId(bsrm.getDtuId());
		this.setMsgId(bsrm.getMsgId());
		this.setMsgTime(bsrm.getMsgTime());
		this.setMsgContent(bsrm.getMsgContent());
		this.setMobile(bsrm.getMobile());
	}
	
	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	
	



}
