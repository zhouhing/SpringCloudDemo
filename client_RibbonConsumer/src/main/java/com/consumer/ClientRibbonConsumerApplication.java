package com.consumer;

import com.myRule.LBRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author ZYH
 * @version 5.0.0
 * created at 2020/11/27 23:40
 * copyright @2020 Beijing Murong Information Technology Co., Ltd.
 */
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@RibbonClient(name = "USER",configuration = LBRule.class)
public class ClientRibbonConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientRibbonConsumerApplication.class, args);
    }
}
