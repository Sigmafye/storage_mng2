package com.ynu.service;

import com.ynu.pojo.OrderGoods;

import java.util.List;

public interface OrderGoodsService {


    /**
     * 根据订单编号添加商品
     * @param orderGoods
     * @return int
     */
    public boolean addGoodsById(OrderGoods orderGoods);


    /**
     * 根据订单编号查找商品
     * @param orderId
     * @return
     */
    public List<OrderGoods> getGoodsList(int orderId);


    /**
     * 根据订单编号删除订单中的商品
     * @param orderId
     * @return
     */
    public boolean deleteOrderGoods(int orderId);
}
