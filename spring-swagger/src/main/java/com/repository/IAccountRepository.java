package com.repository;

import java.util.List;

import com.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IAccountRepository extends JpaRepository<AccountEntity,Long> {

    @Query(value = "select * from account d where d.account_id = ?1", nativeQuery = true)
    List<AccountEntity> findByAccountId(Long accountId);
}