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
        return false;
    }

    public MyOrder getOrderById(int orderId) {
        return null;
    }

    public List<MyOrder> getOrderList() {
        return null;
    }

    public boolean updateOrderById(int orderId) {
        return false;
    }
}
