package com.post.controller.view;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeViewController {
    private Logger LOGGER = LoggerFactory.getLogger(HomeViewController.class);

    @RequestMapping("/index")
    public String home() {
        return "home";
    }
}
