package com.client.service;


import com.serverUser.entity.TbUser;

import java.util.List;

public interface UserService {
    TbUser findUser(Integer userId);

    List<TbUser> findAllUsers();

    int insertUser(TbUser user);

    int updateUser(TbUser user);
}
