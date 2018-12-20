package com.suneee.odb.model.rocketmq;


import com.suneee.odb.config.serializer.constant.Constants;

//短信回复通知基类
public class BaseSmsReplyMessage extends BaseDtuMessage {

	private String mobile; 		//手机号码
	private String msgContent;		//回复消息内容
	
	public String getMsgTopic() {
		return Constants.MQ_TOPIC_NOTIFY;
	}

	public String toString(){
		return "BaseSmsReplyMessage(mobile:"+mobile+"msgContent:"+msgContent +super.toString()+")";
	}
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMsgContent() {
		return msgContent;
	}

	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

}
