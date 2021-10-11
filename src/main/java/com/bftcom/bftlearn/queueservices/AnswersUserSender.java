package com.bftcom.bftlearn.queueservices;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.stereotype.Component;

@Component
public class AnswersUserSender {
    private final AmqpTemplate template;

    private final DirectExchange exchange;

    public AnswersUserSender(AmqpTemplate template, DirectExchange exchange) {
        this.template = template;
        this.exchange = exchange;
    }

    public Boolean send(int number){
        template.convertAndSend(exchange.getName(), "rpc", number);
        return (Boolean) template.convertSendAndReceive(exchange.getName(), "rpc", number);
    }


}
