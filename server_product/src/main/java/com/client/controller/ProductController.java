package com.client.controller;

import com.client.entity.Product;
import com.client.service.ProductService;
import com.client.utils.PageResult;
import com.serverProduct.entity.TbProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

/**
 * @author ZYH
 * @version 5.0.0
 * created at 2020/11/26 17:02
 * copyright @2020 Beijing Murong Information Technology Co., Ltd.
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;
    private String ip;

    @GetMapping("/buy")
    public Product findProduct() {
        Product product = new Product();
        product.setName("香蕉");
        product.setNum("25");
        return product;
    }

    @GetMapping("/buy/{id}")
    public TbProduct findProduct(@PathVariable("id") int id) {
        TbProduct product = productService.findById(id);
        System.out.println(product);
        return product;
    }

    @PostMapping("/findAll")
    public List<TbProduct> findAll(@RequestBody PageResult pageResult) {
        PageResult result = pageResult.getPageResult(pageResult);
        System.out.println(result.getPageIndex() + "__________" + result.getPageLimit());
        List<TbProduct> all = productService.findAll(result);
        Iterator<TbProduct> iterator = all.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        return all;
    }
}
