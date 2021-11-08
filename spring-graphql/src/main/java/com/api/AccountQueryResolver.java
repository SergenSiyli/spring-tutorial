package com.api;

import java.util.List;
import java.util.Optional;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.entity.Account;
import com.repo.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccountQueryResolver implements GraphQLQueryResolver {

    private final AccountRepository accountRepository;

    public List<Account> getAccounts(String  type) {
        return accountRepository.getByCustomerNo(type);
    }

    public Optional<Account> getById(String id) {
        return accountRepository.findById(id);
    }
}