package com.home.wangtao.homequartz.controller;

import com.home.wangtao.homequartz.entity.TestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestApi testApi;

    @GetMapping("aa")
    public void aaa() {
        testApi.test();
    }


}
