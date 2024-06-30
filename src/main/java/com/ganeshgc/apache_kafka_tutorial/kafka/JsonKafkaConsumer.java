package com.ganeshgc.apache_kafka_tutorial.kafka;

import com.ganeshgc.apache_kafka_tutorial.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER= LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics="test-kafka-json-1", groupId="myGroup")
    public void messageConsume(User user) {
        LOGGER.info(String.format("consumed message is -> %s", user.toString()));
    }
}
