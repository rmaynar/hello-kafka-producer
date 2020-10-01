package com.maynar.kafkaproducerdemo1.service;

import com.maynar.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

    @Autowired
    private KafkaTemplate<String, Employee> kafkaTemplate;

    @Autowired
    private KafkaTemplate<String, String> kafkaStringTemplate;

    @Value("${kafka.topic.json}")
    String kafkaTopicJson;

    @Value("${kafka.topic.string}")
    String kafkaTopicString;

    public void sendEmployee(Employee employee) {
        kafkaTemplate.send(kafkaTopicJson, employee);
    }

    public void sendString(String msg) {
        kafkaStringTemplate.send(kafkaTopicString, msg);
    }
}