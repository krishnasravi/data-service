
package com.example.dataprocessing.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ProcessingService {
    @KafkaListener(topics = "user-topic", groupId = "data-group")
    public void process(String message) {
        System.out.println("Processing message: " + message);
        // Add transformation logic here
    }
}
