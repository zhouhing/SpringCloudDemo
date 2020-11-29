package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@MapperScan("com.client.dao")
@SpringBootApplication
@EnableEurekaClient
public class ServerUserSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerUserSpringApplication.class, args);
    }
}
