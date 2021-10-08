package com.bftcom.bftlearn.queueservices;

import com.bftcom.bftlearn.dto.MessageForQueue;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    private final RabbitTemplate template;

    private final Queue messageQueue;

    public MessageSender(RabbitTemplate template, Queue messageQueue) {
        this.template = template;
        this.messageQueue = messageQueue;
    }

    public void send(MessageForQueue message){
        template.convertAndSend(messageQueue.getName(), message);
    }
}
