package com.post.controller.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.post.service.AccountService;

@RequestMapping("/account")
public class AccountViewController {

    @Autowired
    private AccountService accountService;


}
