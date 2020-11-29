package com.serverOrder.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * tb_order
 * @author 
 */
@Data
public class TbOrder implements Serializable {

    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 商品id
     */
    private Integer productId;

    /**
     * 数量
     */
    private Integer number;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 总额
     */
    private BigDecimal amount;

    /**
     * 商品名
     */

    private String productName;

    /**
     * 用户名
     */
    private String username;

    private static final long serialVersionUID = 1L;
}