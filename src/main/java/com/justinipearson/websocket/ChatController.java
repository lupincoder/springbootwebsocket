package com.justinipearson.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
    @MessageMapping("/sendMessage") // client send to /app/sendMessage
    @SendTo("/topic/messages")     //server broadcasts to /topic/messages
    public String broadcastMessage(String message) {
        return "Server received: " + message;
    }
}
