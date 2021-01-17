package com.ynu.controller;


import com.ynu.pojo.OrderGoods;
import com.ynu.service.OrderGoodsService;
import com.ynu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;

@Cacheable
@RequestMapping("/orderGoods")
public class OrderGoodsController {

    @Autowired
    private OrderGoods orderGoods;

    @Autowired
    private OrderGoodsService orderGoodsService;


    @RequestMapping("/updateGoods")
    public  String updateGoods(OrderGoods orderGoods){
        boolean isUpdate=orderGoodsService.updateOrderGoods(orderGoods);
        if (isUpdate){
            //更新成功
            return "success";
        }else{
            //更新失败
            return "failure";
        }
    }

}
