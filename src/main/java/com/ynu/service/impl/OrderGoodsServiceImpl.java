package com.ynu.service.impl;

import com.ynu.mapper.OrderGoodsMapper;
import com.ynu.pojo.OrderGoods;
import com.ynu.service.OrderGoodsService;
import com.ynu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderGoodsServiceImpl implements OrderGoodsService {


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


    public List<OrderGoods> getGoodsList(int orderId){
        List<OrderGoods> goodsList=orderGoodsMapper.getGoodsList(orderId);
        return goodsList;

    }




}
