package com.bftcom.bftlearn.queueservices.validatedanswer;

import com.bftcom.bftlearn.dto.AnswersUser;
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

    public void send(AnswersUser answersUser){
        template.convertAndSend(exchange.getName(), "rpc.answersUser", answersUser);
    }


}
