package com.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService implements  IMessageService{
    @Override
    public String mesajVer(String mesaj) {
        return mesaj;
    }
}
