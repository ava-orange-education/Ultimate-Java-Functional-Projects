package com.chat.demo.controllers;

import com.chat.demo.model.Greeting;
import com.chat.demo.model.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    // Client sends to /app/send, broker broadcasts to /topic/messages
    @MessageMapping("/send")
    @SendTo("/topic/messages")
    public Greeting sendMessage(HelloMessage message) {
        return new Greeting("Hello, " + message.getName() + "!");
    }
}
