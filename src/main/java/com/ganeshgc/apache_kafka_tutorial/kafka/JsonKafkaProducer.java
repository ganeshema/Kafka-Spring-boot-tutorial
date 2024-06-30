package com.ganeshgc.apache_kafka_tutorial.kafka;

import com.ganeshgc.apache_kafka_tutorial.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {
    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;
    private static final Logger logger= LoggerFactory.getLogger(JsonKafkaProducer.class);
    public void sendMessage(User data){
        logger.info(String.format("Sending Message  ->  %s", data));
        Message<User> message= MessageBuilder.withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "test-kafka-json-1")
                .build();
        kafkaTemplate.send(message);
    }
}
