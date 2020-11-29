package com.client.service.serviceImpl;

import com.client.dao.TbProductDao;
import com.client.service.ProductService;
import com.client.utils.PageResult;
import com.serverProduct.entity.TbProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZYH
 * @version 5.0.0
 * created at 2020/11/27 16:17
 * copyright @2020 Beijing Murong Information Technology Co., Ltd.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    TbProductDao productDao;

    @Override
    public TbProduct findById(Integer id) {
        return productDao.selectByPrimaryKey(id);
    }

    @Override
    public List<TbProduct> findAll(PageResult pageResult) {
        return productDao.selectAll(pageResult.getPageIndex(), pageResult.getPageLimit());
    }
}
