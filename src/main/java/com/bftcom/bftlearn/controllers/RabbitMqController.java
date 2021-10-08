package com.bftcom.bftlearn.controllers;

import com.bftcom.bftlearn.dto.MessageForQueue;
import com.bftcom.bftlearn.queueservices.MessageSender;
import com.bftcom.bftlearn.services.MessageQueueService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RabbitMqController {

    private final MessageSender sender;
    private final MessageQueueService messageQueueService;

    public RabbitMqController(MessageSender sender, MessageQueueService messageQueueService) {
        this.messageQueueService = messageQueueService;
        this.sender = sender;
    }

    @PostMapping("/queue")
    public void AddMessageInQueue(@RequestBody MessageForQueue message){
        sender.send(message);
    }

    @GetMapping("/queue/{theme}")
    public List<MessageForQueue> getAllMessagesByTheme(@PathVariable String theme){
        return messageQueueService.getAllMessagesByTheme(theme);
    }

}