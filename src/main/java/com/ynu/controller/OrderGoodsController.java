package com.ynu.controller;


import com.ynu.pojo.MyOrder;
import com.ynu.pojo.OrderGoods;
import com.ynu.service.OrderGoodsService;
import com.ynu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/orderGoods")
public class OrderGoodsController {


    @Autowired
    private OrderGoodsService orderGoodsService;

    @Autowired
    private OrderService orderService;


    /**
     * 更新订单商品
     * @param orderGoods
     * @param model
     * @return
     */
    @RequestMapping("/updateGoods")
    public  String updateGoods(OrderGoods orderGoods,
                               Model model){
        boolean isUpdate=orderGoodsService.updateOrderGoods(orderGoods);
        if (isUpdate){
            //更新成功
            //订单信息
            MyOrder order=orderService.getOrderById(orderGoods.getBl_id());
            //商品信息
            List<OrderGoods> orderGoodsList=orderGoodsService.getGoodsList(orderGoods.getBl_id());
            model.addAttribute("order", order);
            model.addAttribute("goodsList",orderGoodsList);
            return "/WEB-INF/Purchase/add_purchaser_order.jsp";
        }else{
            //更新失败
            model.addAttribute("result", "更新失败");
            return "/WEB-INF/Purchase/updateGoods.jsp";
        }
    }


    /**
     * 删除订单商品
     * @param g_id
     * @param bl_id
     * @param model
     * @return
     */

    @RequestMapping("/deleteGoods/{g_id}/{bl_id}")
    public String deleteGoods(@PathVariable int g_id,
                              @PathVariable int bl_id,
                              Model model){


        boolean isDelete=orderGoodsService.deleteOrderGoods(g_id,bl_id);
        if (isDelete){
            //删除成功
            //订单信息
            MyOrder order=orderService.getOrderById(bl_id);
            //商品信息
            List<OrderGoods> orderGoodsList=orderGoodsService.getGoodsList(bl_id);
            model.addAttribute("order", order);
            model.addAttribute("goodsList",orderGoodsList);
            return "/WEB-INF/Purchase/add_purchaser_order.jsp";
        }else{
            //更新失败
            model.addAttribute("result", "删除失败");
            return "/WEB-INF/Purchase/add_purchaser_order.jsp";
        }

    }

    @RequestMapping("/addOrderGoods/{bl_id}")
    public  String addOrderGoods(OrderGoods orderGoods,
                                 @PathVariable int bl_id,
                                 Model model){
        orderGoods.setBl_id(bl_id);
        System.out.println(orderGoods);
        boolean isAdd=orderGoodsService.addGoodsById(orderGoods);
        if (isAdd){
            //添加成功
            //订单信息
            MyOrder order=orderService.getOrderById(bl_id);
            //商品信息
            List<OrderGoods> orderGoodsList=orderGoodsService.getGoodsList(bl_id);
            model.addAttribute("order", order);
            model.addAttribute("goodsList",orderGoodsList);
            return "/WEB-INF/Purchase/add_purchaser_order.jsp";
        }else{
            //添加失败
            return "/WEB-INF/Purchase/add_commodity.jsp";
        }
    }



}
