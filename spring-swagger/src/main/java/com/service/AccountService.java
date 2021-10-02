package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.dto.AccountDto;
import com.entity.AccountEntity;
import com.repository.IAccountRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService implements IAccountService{

    private final IAccountRepository accountRepository;

    @Override
    @Transactional
    public AccountDto save(AccountDto accountDto) {
        AccountEntity account = new AccountEntity();
        account.setCustomerId(accountDto.getCustomerId());
        account.setAccountId(accountDto.getAccountId());
        account.setAvailableAmount(accountDto.getAvailableAmount());
        account.setCountry(accountDto.getCountry());
        account.setCurrencyType(accountDto.getCurrencyType());
        accountRepository.save(account);
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<AccountDto> getAll() {
        List<AccountEntity> account = accountRepository.findAll();
        List<AccountDto>  accountDtos = new ArrayList<>();
        account.forEach(it-> {
            AccountDto accountDto = new AccountDto();
            accountDto.setAccountId(it.getAccountId());
            accountDto.setCustomerId(it.getCustomerId());
            accountDto.setCountry(it.getCountry());
            accountDto.setCurrencyType(it.getCurrencyType());
            accountDto.setAvailableAmount(it.getAvailableAmount());
            accountDtos.add(accountDto);
        });
        Assert.notEmpty(accountDtos, "Account not found");
        return accountDtos;
    }

    @Override
    public AccountDto getAccountId(Long accountId) {
        Optional<AccountEntity> account = accountRepository.findById(accountId);
        AccountDto accountDto = new AccountDto();
        accountDto.setAccountId(account.get().getAccountId());
        accountDto.setCustomerId(account.get().getCustomerId());
        accountDto.setCountry(account.get().getCountry());
        accountDto.setCurrencyType(account.get().getCurrencyType());
        accountDto.setAvailableAmount(account.get().getAvailableAmount());
        Assert.isNull(accountDto, "Account is not found");
        return accountDto;
    }

    @Override
    public Page<AccountEntity> getAll(Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }
}
