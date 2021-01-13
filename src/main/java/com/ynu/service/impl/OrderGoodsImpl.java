package com.ynu.service.impl;

import com.ynu.mapper.OrderGoodsMapper;
import com.ynu.pojo.OrderGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderGoodsImpl {


    @Autowired
    private OrderGoodsMapper orderGoodsMapper;


    public boolean addGoodsById(OrderGoods orderGoods){
        int isAdd=orderGoodsMapper.addGoodsById(orderGoods);
        if(isAdd>0){
            return true;
        }else{
            return false;
        }
    }




}
