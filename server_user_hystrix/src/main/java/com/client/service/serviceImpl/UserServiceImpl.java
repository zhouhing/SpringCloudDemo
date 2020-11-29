package com.client.service.serviceImpl;

import com.client.dao.TbUserDao;
import com.client.service.UserService;
import com.serverUser.entity.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZYH
 * @version 5.0.0
 * created at 2020/11/25 23:49
 * copyright @2020 Beijing Murong Information Technology Co., Ltd.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private TbUserDao userDao;

    @Override
    public TbUser findUser(Integer userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    @Override
    public List<TbUser> findAllUsers() {
        return userDao.selectAll();
    }

    @Override
    public int insertUser(TbUser user) {
        return userDao.insertSelective(user);
    }

    @Override
    public int updateUser(TbUser user) {
        return updateUser(user);
    }
}
