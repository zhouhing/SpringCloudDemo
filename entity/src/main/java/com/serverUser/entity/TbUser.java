package com.serverUser.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * tb_user
 * @author 
 */
@Data
public class TbUser implements Serializable {
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 余额
     */
    private BigDecimal balance;

    /**
     * 地址
     */
    private String address;

    private static final long serialVersionUID = 1L;
}