package com.consumer.controller;

import com.serverUser.entity.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ZYH
 * @version 5.0.0
 * created at 2020/11/27 23:31
 * copyright @2020 Beijing Murong Information Technology Co., Ltd.
 */
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    //    private final static String URL = "http://localhost:8081";
    private final static String URL = "http://USER";

    @GetMapping("hello")
    public String testString() {

        return "hello world!";
    }

    @GetMapping("/user/find/{id}")
    public TbUser getUser(@PathVariable Integer id) {
        TbUser user = restTemplate.getForObject(URL + "/user/find/" + id, TbUser.class);
        return user;
    }

    @GetMapping("/user/findAll")
    public List<TbUser> getUser() {
        List<TbUser> user = restTemplate.getForObject(URL + "/user/findAll", List.class);
        return user;
    }

}

