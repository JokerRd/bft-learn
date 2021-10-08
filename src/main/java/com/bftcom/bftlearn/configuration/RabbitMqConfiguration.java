package com.bftcom.bftlearn.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;

public class RabbitMqConfiguration
{

    @Bean
    public Queue messageQueue(){
        return new Queue("messageQueue");
    }
}
