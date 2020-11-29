package com.client.controller;

import com.client.entity.Order;
import com.client.entity.Product;
import com.client.service.OrderService;
import com.serverOrder.entity.TbOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author ZYH
 * @version 5.0.0
 * created at 2020/11/26 17:43
 * copyright @2020 Beijing Murong Information Technology Co., Ltd.
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    DiscoveryClient client;

    @Autowired
    OrderService orderService;

    @GetMapping("/find")
    public Order findOrder() {
        Order order = new Order();
        order.setNum(11);
        order.setPrice(100);
        order.setUserName("张三");
        return order;
    }

    @PostMapping("/create")
    public int insertOrder(@RequestBody TbOrder order){
        if (ObjectUtils.isEmpty(order)){
            return 0;
        }
        int i = orderService.insertOrder(order);
        return i;
    }

    /**
     * 直接从某个注册中心获取服务
     * @return
     */
    @GetMapping("/orderbuy")
    public String order() {
        RestTemplate rest = new RestTemplate();
        ServiceInstance instances = client.getInstances("CLIENT02").get(0);
        Product product = rest.getForObject(instances.getUri()+"/product/buy", Product.class);
        System.out.println(product);
        return "成功操作:"+product;
    }

    /**
     * 使用Ribbon负载均衡之后，可以由Ribbon自动获取CLIENT02服务地址，可以自动选择注册中心地址
     * @return
     */
    @GetMapping("/order1buy")
    public String order1() {
        String lb_name = "http://CLIENT02";
        Product product = restTemplate.getForObject(lb_name+"/product/buy", Product.class);
        System.out.println(product);
        return "成功操作:"+product;
    }
}
