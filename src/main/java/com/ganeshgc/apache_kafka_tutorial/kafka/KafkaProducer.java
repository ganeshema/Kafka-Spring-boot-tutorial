package com.ganeshgc.apache_kafka_tutorial.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;



@Service
public class KafkaProducer {

    private static final Logger logger= LoggerFactory.getLogger(KafkaProducer.class);

    private KafkaTemplate<String, String> kafkaTemplate;
    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(String message) {
        logger.info(String.format("Sending message: %s", message));
        kafkaTemplate.send("test-kafka-1", message);
    }


}
