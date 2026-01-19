package com.example.tasks.client;

import com.example.tasks.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements UserClient {

    @Override
    public User getUserById(String id) {
        return new User("N/A", "Fallback User");
    }
}

