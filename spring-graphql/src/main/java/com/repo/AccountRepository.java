package com.repo;

import java.util.List;

import com.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {

    List<Account> getByCustomerNo(String type);

}