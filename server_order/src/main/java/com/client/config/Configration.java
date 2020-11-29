package com.client.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ZYH
 * @version 5.0.0
 * created at 2020/11/27 1:55
 * copyright @2020 Beijing Murong Information Technology Co., Ltd.
 */
@Configuration
public class Configration {
    @Bean
    @LoadBalanced // Ribbon
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
