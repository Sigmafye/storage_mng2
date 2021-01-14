package com.ynu.controller;


import com.ynu.pojo.MyOrder;
import com.ynu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Order")
public class OrderController {


    @Autowired
    private OrderService orderService;


    @RequestMapping("/AddOrder")
    public String addOrder(MyOrder order){

        orderService.addOrder(order);
        return "pass";
    }


}
