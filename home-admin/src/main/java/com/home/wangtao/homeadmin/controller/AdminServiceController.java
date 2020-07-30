package com.home.wangtao.homeadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class AdminServiceController {

    @GetMapping
    public String admin() {
        return "home";
    }
}
