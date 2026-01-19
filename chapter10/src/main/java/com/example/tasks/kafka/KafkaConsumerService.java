package com.example.tasks.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "user-events", groupId = "my-group")
    public void consume(String message) {
        System.out.println("Received message: " + message);
        // process asynchronously
    }
}

