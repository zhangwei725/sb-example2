package com.smart.mybatis.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class TProduct {
    private Long productId;

    private String name;

    private BigDecimal price;

    private String img;

    private Boolean status;

    private Date createDate;
}