package com.client.controller;

import com.client.service.UserService;
import com.serverUser.entity.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserControl {
    @Autowired
    private UserService userService;

    @Value("${server.port}")//从配置文件中获取对应的端口
    private String port;

    @GetMapping("/find/{id}")
    public TbUser findUser(@PathVariable(value = "id") Integer userId) {
        System.out.println(userId);
        TbUser user = null;
        user = userService.findUser(userId);
        user.setAddress("服务端：" + port);
        return user;
    }
    @GetMapping("/findAll")
    public List<TbUser> findAll() {
        List<TbUser> allUsers = userService.findAllUsers();
        for (TbUser user : allUsers) {
            user.setAddress("服务端：" + port);
        }
        return allUsers;

    }

    @PostMapping("/update")
    public int updataUser(TbUser user) {
        return userService.updateUser(user);
    }

    @PostMapping("/create")
    public int insertUser(TbUser user) {
        return userService.insertUser(user);
    }


}
