package com.ggs.user.center.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = {"com.ggs.user.center", "com.ggs.common"})
@EnableEurekaClient
public class UserCenterWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterWebApplication.class, args);
    }

}
