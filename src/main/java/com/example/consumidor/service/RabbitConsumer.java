package com.example.consumidor.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;


@Service
public class RabbitConsumer {
    @RabbitListener(queues = "messages_queue")
    public void receiveMessage(String message) {

        
        //AQUI TENEMOS QUE GENERAR EL REGISTRO EN LA BDDD
        
        

        System.out.println("Mensaje Recibido: " + message);
    }
}
