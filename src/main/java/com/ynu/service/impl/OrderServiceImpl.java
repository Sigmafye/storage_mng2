package com.ynu.service.impl;

import com.ynu.mapper.OrderMapper;
import com.ynu.pojo.MyOrder;
import com.ynu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    private OrderMapper orderMapper;


    public boolean addOrder(MyOrder order) {
        int isAdd=orderMapper.addOrder(order);
        if(isAdd>0){
            return true;
        }else{
            return false;
        }

    }

    public boolean deleteOrderById(int orderId) {
        int isDelete=orderMapper.deleteOrderById(orderId);
        if(isDelete>0){
            return true;
        }else{
            return false;
        }
    }


    public MyOrder getOrderById(int orderId) {
        MyOrder myOrder =orderMapper.getOrderById(orderId);
        return myOrder;
    }

    public List<MyOrder> getOrderList() {
        List<MyOrder> orderList=orderMapper.getOrderList();
        return orderList;
    }

    public boolean updateOrderById(MyOrder order) {
        int isUpdate=orderMapper.updateOrderById(order);
        if(isUpdate>0){
            return true;
        }else{
            return false;
        }
    }


    public List<MyOrder> getOrderListBySupportorId(int s_id) {

        List<MyOrder> orderList=orderMapper.getOrderListBySupportorId(s_id);
        return orderList;
    }
}
