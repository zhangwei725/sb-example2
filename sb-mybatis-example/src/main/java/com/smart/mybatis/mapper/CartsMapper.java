package com.smart.mybatis.mapper;

import com.smart.mybatis.entity.Carts;

public interface CartsMapper {
    int deleteByPrimaryKey(Integer cartsId);

    int insert(Carts record);

    int insertSelective(Carts record);

    Carts selectByPrimaryKey(Integer cartsId);

    int updateByPrimaryKeySelective(Carts record);

    int updateByPrimaryKey(Carts record);


}