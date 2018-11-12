package com.post.member.controller;

import com.post.member.model.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member")
public class MemberViewController {

    @RequestMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }
}
