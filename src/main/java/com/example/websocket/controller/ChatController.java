package com.example.websocket.controller;

import com.example.websocket.entity.FullMessage;
import com.example.websocket.entity.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.util.HtmlUtils;

@Controller
public class ChatController {

    @GetMapping("/chat")
    public String chatGet() {
        return "index";
    }
    @MessageMapping("/chat")
    @SendTo("/topic/chat")
    public FullMessage chat(Message message) throws Exception {
        Thread.sleep(500); // simulated delay
        return new FullMessage(HtmlUtils.htmlEscape(message.getName()) + ": " + HtmlUtils.htmlEscape(message.getMessage()));
    }

}