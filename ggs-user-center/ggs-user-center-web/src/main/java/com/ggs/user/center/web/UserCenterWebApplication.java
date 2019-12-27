package com.ggs.user.center.web;


@SpringBootApplication(scanBasePackages = {"com.ggs.user.center","com.ggs.common"})
@MapperScan("com.ggs.user.center.provider.dao")
@EnableEurekaClient
@EnableTransactionManagement
public class UserCenterWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterWebApplication.class, args);
    }

}
