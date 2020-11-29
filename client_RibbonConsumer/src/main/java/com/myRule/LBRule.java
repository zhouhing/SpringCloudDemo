package com.myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZYH
 * @version 5.0.0
 * created at 2020/11/28 3:06
 * 配置负载均衡的策略
 */
@Configuration
public class LBRule {
    @Bean
    public IRule getRules(){
       return new RandomRule();
    }

}

