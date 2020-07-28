package com.home.wangtao.homeuser.quartz;

import com.home.wangtao.homequartz.entity.TestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuartzController {
    @Autowired
    private TestApi testApi;

    @GetMapping("asdf")
    public void test() {
        testApi.test();
    }
}
