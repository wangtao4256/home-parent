package com.home.wangtao.homequartz.entity;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "quartz", path = "/api")
public interface TestApi {
    @GetMapping("/test")
    public void test();
}