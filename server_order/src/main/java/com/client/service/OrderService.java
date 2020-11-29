package com.client.service;

import com.serverOrder.entity.TbOrder;

/**
 * @author ZYH
 * @version 5.0.0
 * created at 2020/11/27 19:44
 * copyright @2020 Beijing Murong Information Technology Co., Ltd.
 */
public interface OrderService {
    int insertOrder(TbOrder order);
}
