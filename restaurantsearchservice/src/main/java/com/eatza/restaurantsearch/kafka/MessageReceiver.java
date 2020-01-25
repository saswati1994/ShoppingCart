package com.eatza.restaurantsearch.kafka;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;



@Service
public class MessageReceiver {
	
	private static final Logger logger = LoggerFactory.getLogger(MessageReceiver.class);
	
	@KafkaListener(topics = "${kafka-topic}")
	public void listen(@Payload String message) {
		logger.info("received message='{}'", message);
	}

}
