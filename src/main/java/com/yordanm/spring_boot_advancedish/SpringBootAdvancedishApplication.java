package com.yordanm.spring_boot_advancedish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootAdvancedishApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdvancedishApplication.class, args);
    }

}
