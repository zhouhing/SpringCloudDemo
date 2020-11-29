package com.client;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

//@MapperScan("com.client.dao")
@SpringBootApplication
@EnableEurekaClient//服务启动后自动添加到Eureka中
@EnableDiscoveryClient//服务发现
@EnableCircuitBreaker//添加对熔断的支持
public class ServerUserHystrixSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerUserHystrixSpringApplication.class, args);
    }

    //为了使得hystrix-dashboard能监控到，需要添加一个servlet,配合监控
    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet() {
        ServletRegistrationBean servletRegistrationBean =
                new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        servletRegistrationBean.addUrlMappings("/actuator/hystrix.stream");
        //将HystrixMetricsStreamServlet这个Servlet映射到/actuator/hystrix.stream，
        // 由HystrixMetricsStreamServlet进行数据的接受和处理，最终返回到页面
        return servletRegistrationBean;
    }
}
