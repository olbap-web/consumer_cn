package com.example.consumidor.service;

import java.util.List;

import com.example.consumidor.entity.MessageEntity;

public interface MessageService {
    List<MessageEntity> getMessages();
    MessageEntity getMessageById(Long id);

    MessageEntity createMessage(MessageEntity message);

}