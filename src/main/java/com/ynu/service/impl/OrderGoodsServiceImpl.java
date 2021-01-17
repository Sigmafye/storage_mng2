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


    public boolean deleteOrderGoods(int orderId) {

        int isDelete=orderGoodsMapper.deleteOrderGoods(orderId);
        if(isDelete>0){
            return true;
        }else{
            return false;
        }
    }


    public List<OrderGoods> getOrderGoodsList() {
        List<OrderGoods> orderGoodsList=orderGoodsMapper.getOrderGoodsList();
        return orderGoodsList;
    }


    public OrderGoods getOrderGoodsByGidBlId(int g_id, int bl_id) {
        OrderGoods orderGoods=orderGoodsMapper.getOrderGoodsByGidBlId(g_id,bl_id);

        return orderGoods;
    }

    public boolean updateOrderGoods(OrderGoods orderGoods) {
        return orderGoodsMapper.updateOrderGoods(orderGoods);
    }
}
