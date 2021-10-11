package com.bftcom.bftlearn.configuration;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfiguration {

    @Bean
    public Queue messageQueue() {
        return new Queue("messageQueue");
    }

    @Bean
    public Queue answersUserQueue() {
        return new Queue("exchange.rpc.answersUser");
    }

    @Bean
    public Queue verifiedAnswerQueue() {
        return new Queue("exchange.rpc.verified");
    }

    @Bean
    public Queue exchangeQueue() {
        return new Queue("exchange.rpc.messageQueue");
    }

    @Bean
    public DirectExchange exchange() {
        return new DirectExchange("exchange.rpc");
    }

    @Bean
    public Binding binding(DirectExchange exchange,
                           Queue exchangeQueue) {
        return BindingBuilder.bind(exchangeQueue)
                .to(exchange)
                .with("rpc");
    }


    @Bean
    public Binding bindingAnswersUser(DirectExchange exchange,
                                      Queue answersUserQueue) {
        return BindingBuilder.bind(answersUserQueue).to(exchange).with("rpc.answersUser");
    }


    @Bean
    public Binding bindingVerifiedAnswer(DirectExchange exchange,
                                      Queue verifiedAnswerQueue) {
        return BindingBuilder.bind(verifiedAnswerQueue).to(exchange).with("rpc.verified");
    }

    @Bean
    public MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public AmqpTemplate template(ConnectionFactory connectionFactory) {
        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(jsonMessageConverter());
        return rabbitTemplate;
    }
}
