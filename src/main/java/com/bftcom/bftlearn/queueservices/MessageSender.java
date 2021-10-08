package com.bftcom.bftlearn.queueservices;

import com.bftcom.bftlearn.dto.MessageForQueue;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    private final RabbitTemplate template;

    private final Queue queue;

    public MessageSender(RabbitTemplate template, Queue queue) {
        this.template = template;
        this.queue = queue;
    }

    public void Send(MessageForQueue message){
        template.convertAndSend(queue.getName(), message);
    }
}
