package com.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ZYH
 * @version 5.0.0
 * created at 2020/11/27 23:40
 * copyright @2020 Beijing Murong Information Technology Co., Ltd.
 */
@SpringBootApplication
@EnableFeignClients(basePackages={"com.serverUser"})//扫描服务提供接口的所在包
@ComponentScan({"com.serverUser.service","com.consumer.controller"})//将com.serverUser.service包里的bean扫描进来,
// 注意使用@ComponmentScan注解后，@springBootApplication注解会失效，所以需要将本项目下需要使用的Bean的包添加进来
public class ClientFeignConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientFeignConsumerApplication.class, args);
    }
}
