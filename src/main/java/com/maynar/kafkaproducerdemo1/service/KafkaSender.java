package com.maynar.kafkaproducerdemo1.service;

import com.maynar.kafkaproducerdemo1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

    @Autowired
    private KafkaTemplate<String, Employee> kafkaTemplate;

    @Value("${kafka.topic}")
    String kafkaTopic;

    public void send(Employee employee) {
        kafkaTemplate.send(kafkaTopic, employee);
    }
}