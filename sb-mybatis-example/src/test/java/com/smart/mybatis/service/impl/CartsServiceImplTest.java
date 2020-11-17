package com.smart.mybatis.service.impl;

import org.junit.jupiter.api.Test;

import com.smart.mybatis.entity.Carts;
import com.smart.mybatis.service.CartsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
public class CartsServiceImplTest {
    @Resource
    CartsService service;

    @Test
    public void add() {
//        FATAL
//        log.error();
//        log.info();
//        log.debug();
//        log.trace();
        Carts carts = new Carts();
        carts.setProductId(1);
        carts.setQuantity(10);
        carts.setUserId(1);
        int add = service.add(carts);
        log.info("添加商品是否成功:{}", add > 0);
    }
}