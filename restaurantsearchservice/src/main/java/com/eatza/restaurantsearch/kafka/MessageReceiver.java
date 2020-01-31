package com.eatza.restaurantsearch.kafka;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

import com.eatza.restaurantsearch.model.Message;



@Service
@EnableBinding(Sink.class) 
public class MessageReceiver {
	
private static final Logger logger = LoggerFactory.getLogger(MessageReceiver.class);
	
	@StreamListener("input")
	public void receiveMessage(Message message) {
		logger.info("Received message is : " + message);
	}


}
