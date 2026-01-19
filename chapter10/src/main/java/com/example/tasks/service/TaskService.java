package com.example.tasks.service;

import com.example.tasks.client.UserClient;
import com.example.tasks.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private UserClient userClient;

    public User performTask(String userId) {
        User user = userClient.getUserById(userId);
        // process user...
        return user;
    }
}

