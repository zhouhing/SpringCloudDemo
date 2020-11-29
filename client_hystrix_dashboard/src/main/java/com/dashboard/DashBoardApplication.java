package com.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author ZYH
 * @version 5.0.0
 * created at 2020/11/28 23:08
 * copyright @2020 Beijing Murong Information Technology Co., Ltd.
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DashBoardApplication {
    public static void main(String[] args) {
        SpringApplication.run(DashBoardApplication.class, args);
    }
}
