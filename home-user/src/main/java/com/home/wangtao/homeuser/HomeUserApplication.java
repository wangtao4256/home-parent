package com.home.wangtao.homeuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class HomeUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeUserApplication.class, args);
    }

}
