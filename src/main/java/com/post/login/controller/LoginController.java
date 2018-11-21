package com.post.login.controller;

import com.post.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view/login")
public class LoginController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/index")
    public String loginView() {
        return "login";
    }

    @RequestMapping("/proc")
    public String loginProcess(String email, String pasword) {
        return "";
    }
}
