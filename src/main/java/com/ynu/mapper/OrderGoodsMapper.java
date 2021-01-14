package com.ynu.mapper;

import com.ynu.pojo.OrderGoods;

import java.util.List;

public interface OrderGoodsMapper {

    /**
     * 根据订单编号添加商品
     * @param orderGoods
     * @return int
     */
    public int addGoodsById(OrderGoods orderGoods);


    /**
     * 根据订单编号查找商品
     * @param orderId
     * @return
     */
    public List<OrderGoods> getGoodsList(int orderId);


}
