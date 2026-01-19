package com.example.tasks.controller;

import com.example.tasks.kafka.KafkaProducerService;
import com.example.tasks.model.User;
import com.example.tasks.service.TaskService;
import com.example.tasks.service.UserRestTemplateService;
import com.example.tasks.service.UserWebClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @Autowired
    private UserRestTemplateService userRestTemplateService;

    @Autowired
    private UserWebClientService userWebClientService;

    @Autowired
    private TaskService taskService;

    @PostMapping("/kafka")
    public String sendKafka(@RequestBody String message) {
        kafkaProducerService.sendMessage(message);
        return "Sent: " + message;
    }

    @GetMapping("/rest/{id}")
    public User getUserRest(@PathVariable String id) {
        return userRestTemplateService.getUserById(id);
    }

    @GetMapping("/webclient/{id}")
    public Mono<User> getUserWebClient(@PathVariable String id) {
        return userWebClientService.getUserById(id);
    }

    @GetMapping("/feign/{id}")
    public User getUserFeign(@PathVariable String id) {
        return taskService.performTask(id);
    }
}

