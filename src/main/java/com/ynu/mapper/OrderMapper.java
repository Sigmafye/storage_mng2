package com.ynu.mapper;

import com.ynu.pojo.MyOrder;

import java.util.List;

public interface OrderMapper {


    /**
     * 增加一个订单
     * @param order
     * @return
     */
    public int addOrder(MyOrder order);


    /**
     * 根据订单编号删除一个订单
     * @param orderId
     * @return
     */
    public int deleteOrderById(int orderId);


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
     * @param order
     * @return
     */
    public int updateOrderById(MyOrder order);


    /**
     * 根据供应商id返回相应订单
     * @param s_id
     * @return
     */
    public List<MyOrder> getOrderListBySupportorId(int s_id);


}
