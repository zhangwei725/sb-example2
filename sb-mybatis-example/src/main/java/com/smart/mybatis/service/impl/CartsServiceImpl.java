package com.smart.mybatis.service.impl;

import com.smart.mybatis.entity.Carts;
import com.smart.mybatis.mapper.CartsMapper;
import com.smart.mybatis.service.CartsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CartsServiceImpl implements CartsService {
    @Resource
    CartsMapper mapper;

    @Override
    public int add(Carts carts) {
        int i = mapper.insertSelective(carts);
        return i;
    }
}
