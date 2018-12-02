package com.post.service;

import com.post.model.Account;
import com.post.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Account findById(String email) {
        return accountRepository.findById(email);
    }

    public int signup(Account account) {
        String encPassword = passwordEncoder.encode(account.getPassword());
        account.setPassword(encPassword);
        return accountRepository.insert(account);
    }
}
