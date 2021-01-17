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
     * 获取当前订单商品中的所有商品
     * @return
     */
    public List<OrderGoods> getOrderGoodsList();

    /**
     * 根据订单编号删除订单中的商品
     * @param orderId
     * @return
     */
    public boolean deleteOrderGoods(int orderId);

    /**
     * 根据商品编号和订单编号确定唯一一个订单商品
     * @param g_id
     * @param bl_id
     * @return
     */
    public OrderGoods getOrderGoodsByGidBlId(int g_id,int bl_id);


    /**
     * 更新订单商品信息
     * @param orderGoods
     * @return
     */
    public boolean updateOrderGoods(OrderGoods orderGoods);
}
