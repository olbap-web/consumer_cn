package com.example.consumidor.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue myQueue() {
        return new Queue("messages_queue", true);
    }
    @Bean
    public Queue myQueue2() {
        return new Queue("messages_queue2", true);
    }
}