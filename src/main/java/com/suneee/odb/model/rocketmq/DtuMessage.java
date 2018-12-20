
package com.suneee.odb.model.rocketmq;


public interface DtuMessage {
	String getMsgTopic ();
	String getMsgTag ();
	String getMsgKey ();
}
