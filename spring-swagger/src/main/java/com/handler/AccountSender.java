package com.handler;

import com.entity.AccountEntity;
import com.producer.AccountProducer;
import com.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;

import javax.annotation.PostConstruct;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AccountSender {

    @Autowired
    private AccountProducer producer;

    private final IAccountRepository accountRepository;

    public void getThread() {
        Thread thread = new Thread(() -> {
            while (true) {
                List<AccountEntity> accOptional = accountRepository.findByAccountId(Long.valueOf(5));
                if(!accOptional.isEmpty())
                    producer.sendToQueue(accOptional);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setName("Account sender");
        thread.start();
    }

    @PostConstruct
    public void init() {
        getThread();

    }
}