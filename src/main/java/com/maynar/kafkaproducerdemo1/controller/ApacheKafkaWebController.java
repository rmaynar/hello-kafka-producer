package com.maynar.kafkaproducerdemo1.controller;

import com.maynar.kafkaproducerdemo1.model.Employee;
import com.maynar.kafkaproducerdemo1.service.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/kafka")
public class ApacheKafkaWebController {

    @Autowired
    private KafkaSender kafkaSender;

    @PostMapping(value = "/employee")
    public String producer(@RequestBody Employee employee) {
        kafkaSender.send(employee);

        return "Message sent to the Kafka Topic Successfully";
    }

}
