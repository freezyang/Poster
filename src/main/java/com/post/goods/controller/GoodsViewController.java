package com.post.goods.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goods")
public class GoodsViewController {

    @RequestMapping("/register")
    public String registerPage() {
        return "/goods/register";
    }
}
