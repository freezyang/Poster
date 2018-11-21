package com.post.account.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.post.account.mapper.AccountMapper;
import com.post.account.model.Account;

@Repository
public class AccountRepository {

    @Autowired
    private AccountMapper accountMapper;

    public Account findById(String email) {
        return accountMapper.findById(new Account(email));
    }
}
