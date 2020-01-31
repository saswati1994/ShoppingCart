package com.eatza.order.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.eatza.order.model.Message;


@Service
@EnableBinding(Source.class)
public class MessageSender {
	
	@Autowired
	MessageChannel output;
	
	private static final Logger LOG = LoggerFactory.getLogger(MessageSender.class);
	
	
	
	public Message sendMessage(@RequestBody Message message){
		output.send(MessageBuilder.withPayload(message).build());
		LOG.info("sending data='{}' to topic='{}'", message);
		return message;
		
	} 

}
