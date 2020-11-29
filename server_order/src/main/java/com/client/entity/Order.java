package com.client.entity;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZYH
 * @version 5.0.0
 * created at 2020/11/26 17:41
 * copyright @2020 Beijing Murong Information Technology Co., Ltd.
 */
@Data
public class Order {
    private Integer num;
    private Integer price;
    private String userName;
}
