package com.ynu.service;

import com.ynu.pojo.MyOrder;


import java.util.List;

public interface OrderService {


    /**
     * 增加一个订单
     * @param order
     * @return
     */
    public boolean addOrder(MyOrder order);


    /**
     * 根据订单编号删除一个订单
     * @param orderId
     * @return
     */
    public boolean deleteOrderById(int orderId);


    /**
     * 根据订单编号查询一个订单
     * @param orderId
     * @return
     */
    public MyOrder getOrderById(int orderId);


    /**
     * 返回所有订单列表
     * @return
     */
    public List<MyOrder> getOrderList();

    /**
     * 根据订单编号更新订单信息
     * @param orderId
     * @return
     */
    public boolean updateOrderById(MyOrder order);

}
