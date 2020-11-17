package com.smart.mybatis.entity;

import lombok.Data;

@Data
public class Carts {
    private Integer cartsId;

    /**
    * 0表示删除  1表示正常
    */
    private Integer status;

    private Integer userId;

    private Integer productId;

    private Integer quantity;
}