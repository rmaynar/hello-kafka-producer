package com.maynar.kafkaproducerdemo1.controller;

import com.maynar.kafkaproducerdemo1.service.KafkaSender;
import com.maynar.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/kafka")
public class ApacheKafkaWebController {

    @Autowired
    private KafkaSender kafkaSender;

    @PostMapping(value = "/employee")
    public String producer(@RequestBody Employee employee) {
        kafkaSender.sendEmployee(employee);
        return "Json Message sent to the Kafka Topic Successfully";
    }

    @GetMapping("/message")
    public String publishMsg(@RequestParam String msg){
        kafkaSender.sendString(msg);
        return "Plain Message sent to the Kafka Topic Successfully";
    }
}
