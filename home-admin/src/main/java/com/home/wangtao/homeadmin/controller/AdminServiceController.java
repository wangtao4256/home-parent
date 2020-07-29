package com.home.wangtao.homeadmin.controller;

import com.home.wangtao.homeadmin.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminServiceController {
    @Autowired
    TestMapper testMapper;

    @GetMapping("/home")
    public String admin() {
        System.out.println(testMapper.selectList(null).size());
        return "home";
    }
}
