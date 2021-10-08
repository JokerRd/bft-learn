package com.bftcom.bftlearn.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfiguration
{

    @Bean
    public Queue messageQueue(){
        return new Queue("messageQueue");
    }
}
