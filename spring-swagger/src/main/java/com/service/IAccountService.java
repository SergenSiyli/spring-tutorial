package com.service;

import com.dto.AccountDto;
import com.entity.AccountEntity;
import org.springframework.data.domain.Pageable;


import java.util.List;

import org.springframework.data.domain.Page;

public interface IAccountService {

    AccountDto save(AccountDto accountDto);

    void delete(Long id);

    List<AccountDto> getAll();

    AccountDto getAccountId(Long accountId);

    Page<AccountEntity> getAll(Pageable pageable);

}
