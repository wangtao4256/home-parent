package com.home.wangtao.homeadmin;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class HomeAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeAdminApplication.class, args);
    }

}
