package com.ganeshgc.apache_kafka_tutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic kafkaTestTopic() {
        return TopicBuilder.name("test-kafka-1")
                .partitions(5)
                .replicas(3)
                .build();
    }
}
