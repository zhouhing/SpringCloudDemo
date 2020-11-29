package com.consumer.controller;

import com.serverUser.entity.TbUser;
import com.serverUser.service.UserFeignLBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ZYH
 * @version 5.0.0
 * created at 2020/11/27 23:31
 * copyright @2020 Beijing Murong Information Technology Co., Ltd.
 */
@RestController
public class FeignConsumerController {

    @Autowired
    private UserFeignLBService feignLBService;

    //    private final static String URL = "http://localhost:8081";
    private final static String URL = "http://USER";

    @GetMapping("hello")
    public String testString() {

        return "hello world!";
    }

    @GetMapping("/feign/{id}")
    public TbUser getUser(@PathVariable Integer id) {
        TbUser user = feignLBService.findUser(id);
        return user;
    }

    @GetMapping("/feign/findAll")
    public List<TbUser> getUsers() {
        List<TbUser> users = feignLBService.findAll();
        return users;
    }
}

