package com.post.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.post.account.service.AccountService;

@RequestMapping("/account")
public class AccountViewController {

    @Autowired
    private AccountService accountService;


}
