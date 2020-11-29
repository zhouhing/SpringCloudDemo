package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZYH
 * @version 5.0.0
 * created at 2020/11/26 17:13
 * copyright @2020 Beijing Murong Information Technology Co., Ltd.
 */
@SpringBootApplication
@EnableEurekaClient
public class ServerOrderSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerOrderSpringApplication.class, args);
    }
}
