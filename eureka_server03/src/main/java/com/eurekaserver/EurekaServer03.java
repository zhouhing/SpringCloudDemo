package com.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ZYH
 * @version 5.0.0
 * created at 2020/11/27 0:32
 * copyright @2020 Beijing Murong Information Technology Co., Ltd.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer03 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer03.class, args);
    }
}
