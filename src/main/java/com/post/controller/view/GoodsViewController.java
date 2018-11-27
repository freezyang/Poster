package com.post.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goods")
public class GoodsViewController {

    @GetMapping("/register")
    public String registerPage() {
        return "/goods/register";
    }

    @GetMapping("/list")
    public String list() {
        return "/goods/list";
    }
}
