package com.producer;


import java.util.List;

import com.entity.AccountEntity;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AccountProducer {

    @Value("${sr.rabbit.routing.name}")
    private String routingName;

    @Value("${sr.rabbit.exchange.name}")
    private String exchangeName;


    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendToQueue(List<AccountEntity> account) {
        System.out.println("Account ID : " + account.get(0).getAccountId());
        rabbitTemplate.convertAndSend(exchangeName, routingName, account);
    }
}