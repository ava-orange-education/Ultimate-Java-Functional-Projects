package com.example.tasks.service;

import com.example.tasks.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class UserWebClientService {

    @Autowired
    private WebClient.Builder webClientBuilder;

    public Mono<User> getUserById(String id) {
        return webClientBuilder
                .build()
                .get()
                .uri("http://user-service/users/{id}", id)
                .retrieve()
                .bodyToMono(User.class);
    }
}

