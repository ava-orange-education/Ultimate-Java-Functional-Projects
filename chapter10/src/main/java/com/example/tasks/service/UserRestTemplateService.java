package com.example.tasks.service;

import com.example.microcomm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserRestTemplateService {

    @Autowired
    private RestTemplate restTemplate;

    // Example synchronous REST call
    public User getUserById(String id) {
        String url = "http://user-service/users/" + id;
        return restTemplate.getForObject(url, User.class);
    }
}

