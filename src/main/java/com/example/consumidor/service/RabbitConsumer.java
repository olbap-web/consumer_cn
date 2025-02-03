package com.example.consumidor.service;

import java.util.List;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.consumidor.entity.MessageEntity;


@Service
public class RabbitConsumer {

    @Autowired
    MessageService messageService;

    @RabbitListener(queues = "messages_queue")
    public void receiveMessage(String message) {

        
        //AQUI TENEMOS QUE GENERAR EL REGISTRO EN LA BDDD

        // List<MessageEntity> msjs = messageService.getMessages();


        System.out.println("Mensaje Recibido cola 1: " + message);
    }

    @RabbitListener(queues = "messages_queue2")
    public void receiveMessage2(String message) {

        
        //AQUI TENEMOS QUE GENERAR EL REGISTRO EN LA BDDD

        // List<MessageEntity> msjs = messageService.getMessages();



        System.out.println("Mensaje Recibido cola 2: " + message);

    }
}
