package com.suneee.odb.config.rocketmq.consumer.listener;

import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import com.alibaba.rocketmq.common.message.MessageExt;
import com.suneee.odb.config.serializer.constant.Constants;
import com.suneee.odb.config.serializer.impl.KryoSerializer;
import com.suneee.odb.model.rocketmq.GpsInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ GPS主题类消息监听处理器
 * 
 * @ wjf
 * @ 2016-07-21
 */

@Slf4j
@Service
public class TopicGpsMessageListener implements MessageListenerConcurrently {

	@Autowired
	private KryoSerializer kryoSerializer;

	@Override
	public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
			
			List<GpsInfo> gpsList = new ArrayList<GpsInfo> ();
			Iterator<MessageExt> it = msgs.iterator();
			while(it.hasNext()){
				MessageExt msg = it.next();
				if( msg.getTopic().equals(Constants.MQ_TOPIC_GPS) ){
					String tag  = msg.getTags();
					if( tag!=null && tag.equals( GpsInfo.class.getSimpleName()) ){						
						GpsInfo gpsMsg = kryoSerializer.fromBytes(msg.getBody(), GpsInfo.class);
						gpsList.add(gpsMsg);

					}

					log.info ("GPS消息为:-->[{}]",gpsList.toString ());
					
				}				
			}
			
			boolean consumerRet = true; //消费处理结果			
			{
				//批量处理收到的ECU工况数据信息，根据处理结果设置 consumerRet。		
			}
			
			return consumerRet ? ConsumeConcurrentlyStatus.CONSUME_SUCCESS : ConsumeConcurrentlyStatus.RECONSUME_LATER;
	}
}
