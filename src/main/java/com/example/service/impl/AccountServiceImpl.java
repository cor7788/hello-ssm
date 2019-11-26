package com.example.service.impl;

import com.example.dao.AccountDao;
import com.example.domain.Account;
import com.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        List<Account> list = accountDao.findAll();
        return list;
    }

    @Override
    public void saveAccount(Account account) {

    }
}
