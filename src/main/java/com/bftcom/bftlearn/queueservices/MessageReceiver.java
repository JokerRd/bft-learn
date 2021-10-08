package com.bftcom.bftlearn.queueservices;

import com.bftcom.bftlearn.dto.MessageForQueue;
import com.bftcom.bftlearn.repository.MessageQueueRepository;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "messageQueue")
public class MessageReceiver {

    private final MessageQueueRepository messageQueueRepository;

    public MessageReceiver(MessageQueueRepository messageQueueRepository) {
        this.messageQueueRepository = messageQueueRepository;
    }

    @RabbitHandler
    public void receive(MessageForQueue message){

    }
}
