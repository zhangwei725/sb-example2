package com.smart.mybatis.mapper;

import com.smart.mybatis.entity.ProductStock;

public interface ProductStockMapper {
    int deleteByPrimaryKey(Integer stockId);

    int insert(ProductStock record);

    int insertSelective(ProductStock record);

    ProductStock selectByPrimaryKey(Integer stockId);

    int updateByPrimaryKeySelective(ProductStock record);

    int updateByPrimaryKey(ProductStock record);
}