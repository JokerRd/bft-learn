package com.bftcom.bftlearn.queueservices;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class MessageRpcReceiver {

    @RabbitListener(queues = "exchange.rpc.messageQueue")
    public Boolean isEven(Integer number){
        return number % 2 == 0;
    }
}
