package com.listener;

import com.entity.AccountEntity;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;


@Service
public class AccountListener {
    @RabbitListener(queues = "swagger-queue")
    public void handleMessage(AccountEntity account) {

        System.out.println("Message received..");
        System.out.println(account.toString());
    }
}
