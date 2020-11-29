package com.serverUser.service;

import com.serverUser.entity.TbUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author ZYH
 * @version 5.0.0
 * created at 2020/11/28 3:43
 * 使用Feign实现负载均衡
 */
@FeignClient(value = "USER", fallbackFactory = UserFeignLBServiceFallbackFactory.class)//value值为所需要调用的服务
public interface UserFeignLBService {

    @GetMapping("/user/find/{id}")
    TbUser findUser(@PathVariable(value = "id") Integer userId);

    @GetMapping("user/findAll")
    List<TbUser> findAll();
}
