package com.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ZYH
 * @version 5.0.0
 * created at 2020/11/27 23:31
 * copyright @2020 Beijing Murong Information Technology Co., Ltd.
 */
@Configuration
public class Configration {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
