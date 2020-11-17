package com.smart.mybatis.mapper;

import com.smart.mybatis.entity.TOrderItem;

public interface TOrderItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TOrderItem record);

    int insertSelective(TOrderItem record);

    TOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TOrderItem record);

    int updateByPrimaryKey(TOrderItem record);
}