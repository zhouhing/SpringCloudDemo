package com.serverProduct.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * tb_product
 * @author 
 */
@Data
public class TbProduct implements Serializable {
    private Integer id;

    /**
     * 名称
     */
    private String productName;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 描述
     */
    private String productDesc;

    /**
     * 标题
     */
    private String caption;

    /**
     * 库存
     */
    private Integer inventory;

    private static final long serialVersionUID = 1L;
}