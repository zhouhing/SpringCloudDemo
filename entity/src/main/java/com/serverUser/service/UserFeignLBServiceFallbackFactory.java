package com.serverUser.service;

import com.serverUser.entity.TbUser;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZYH
 * @version 5.0.0
 * created at 2020/11/28 21:38
 * copyright @2020 Beijing Murong Information Technology Co., Ltd.
 */
@Component
public class UserFeignLBServiceFallbackFactory implements FallbackFactory<UserFeignLBService> {
    @Override
    public UserFeignLBService create(Throwable throwable) {
        return new UserFeignLBService() {
            @Override
            public TbUser findUser(Integer userId) {
                TbUser user = new TbUser();
                user.setId(userId);
                user.setAddress("用户==》" + userId + "==不存在 @ 服务降级");
                return user;
            }

            @Override
            public List<TbUser> findAll() {
                ArrayList<TbUser> users = new ArrayList();
                TbUser user = new TbUser();
                user.setId(0);
                user.setAddress(" @ 服务降级");
                users.add(user);
                return users;
            }
        };
    }
}
