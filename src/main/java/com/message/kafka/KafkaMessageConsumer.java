package com.message.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageConsumer {

	private static final Logger log = LoggerFactory.getLogger(KafkaMessageConsumer.class);
	
	@KafkaListener(topics = "topic1", groupId = "bank-project", containerFactory = "bankProjectKafkaListenerContainerFactory")
	public void consumeMessage(String message) {
		log.info("consuming message from topic, message : {}", message);
		log.info("trigger mail, message : {}", message);
	}
}
