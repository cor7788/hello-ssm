package com.example.dao;

import com.example.domain.Account;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public interface AccountDao {

    List<Account> findAll();
    void saveAccount(Account account);
}
