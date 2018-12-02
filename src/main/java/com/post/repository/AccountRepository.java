package com.post.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.post.mapper.AccountMapper;
import com.post.model.Account;

@Repository
public class AccountRepository {

    @Autowired
    private AccountMapper accountMapper;

    public Account findById(String email) {
        return accountMapper.findById(new Account(email));
    }

    public int insert(Account account) {
        return accountMapper.insert(account);
    }
}
