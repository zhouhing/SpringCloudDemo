package com.client.service.Impl;

import com.client.dao.TbOrderDao;
import com.client.service.OrderService;
import com.serverOrder.entity.TbOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ZYH
 * @version 5.0.0
 * created at 2020/11/27 19:46
 * copyright @2020 Beijing Murong Information Technology Co., Ltd.
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    TbOrderDao orderDao;

    @Override
    public int insertOrder(TbOrder order) {
        return orderDao.insertSelective(order);
    }
}
