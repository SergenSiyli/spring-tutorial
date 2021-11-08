package com.api;

import java.util.Date;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.dto.AccountDto;
import com.entity.Account;
import com.repo.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccountMutationResolver implements GraphQLMutationResolver {

    private final AccountRepository accountRepository;

    public Account createAccount(AccountDto accountDto) {
        return accountRepository.save(dtoToEntity(accountDto));
    }

    private Account dtoToEntity(AccountDto accountDto){
        Account account=new Account();
        account.setCustomerNo(accountDto.getCustomerNo());
        account.setName(accountDto.getName());
        account.setSurname(accountDto.getSurname());
        account.setNationalityNumber(accountDto.getNationalityNumber());
        return account;
    }
}