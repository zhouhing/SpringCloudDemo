package com.client.service;

import com.client.utils.PageResult;
import com.serverProduct.entity.TbProduct;

import java.util.List;

/**
 * @author ZYH
 * @version 5.0.0
 * created at 2020/11/27 16:15
 * copyright @2020 Beijing Murong Information Technology Co., Ltd.
 */
public interface ProductService {
    TbProduct findById(Integer id);

    List<TbProduct> findAll(PageResult pageResult);
}
