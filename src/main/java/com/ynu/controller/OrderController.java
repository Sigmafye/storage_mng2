package com.ynu.controller;


import com.ynu.pojo.Buyer;
import com.ynu.pojo.MyOrder;
import com.ynu.pojo.OrderGoods;
import com.ynu.pojo.Supportor;
import com.ynu.service.BuyerService;
import com.ynu.service.OrderGoodsService;
import com.ynu.service.OrderService;
import com.ynu.service.SupportorService;
import org.junit.runners.Parameterized;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/order")
public class OrderController {


    @Autowired
    private OrderService orderService;//订单服务

    @Autowired
    private OrderGoodsService orderGoodsService;//订单商品服务

    @Autowired
    private BuyerService buyerService;//采购员服务

    @Autowired
    private SupportorService supportorService;//供应商服务

    /**
     * 增加订单基本信息
     *
     * @param
     * @param model
     * @return
     */
    @RequestMapping("/addOrder")
    public String addOrderInfo(MyOrder order,
                               Model model) {

        /*先添加采购员--buyer--
          再添加供应商--supportor
          添加订单表--buy_list
          添加采购商品表--gds_tobuy
         */
        System.out.println("OrderController:" + order);
        boolean isAddOrder = orderService.addOrder(order);
        /*
        检查是否添加成功
         */

        if (isAddOrder) {
            //创建订单成功
            //返回当前订单中已有的商品
//            List<OrderGoods> orderGoodsList=orderGoodsService.getGoodsList(order.getBl_id());
//            model.addAttribute("orderGoodsList",orderGoodsList);
            List<MyOrder> orderList = orderService.getOrderList();
            model.addAttribute("orderList", orderList);
            //返回
            return "/WEB-INF/Purchase/purchaser_order_manage.jsp";
        } else {
            //创建订单失败
            return "fuilure";
        }
    }


    /**
     * 根据订单编号向订单中添加商品
     *
     * @param bl_id
     * @return
     */
    @RequestMapping("/addOrderGoods/{bl_id}")
    public String addOrderGoods(@PathVariable int bl_id,//订单编号不能为空
                                Model model) {//商品类

        //根据订单编号查找对应订单信息
        MyOrder myOrder = orderService.getOrderById(bl_id);
        if (myOrder == null) {
            //无该订单信息，需要先添加订单信息。
            return "failure";
        } else {
            //存在该订单
            model.addAttribute("myOrder", myOrder);
            return "/WEB-INF/Purchase/add_purchaser_order.jsp";
        }
    }


    /**
     * 根据订单编号删除订单，
     * 先删除订单中的商品
     * 再删除订单信息
     *
     * @return
     */
    @RequestMapping("/deleteOrder/{bl_id}")
    public String deleteOrderById(@PathVariable int bl_id,
                                  Model model) {
        System.out.println(bl_id);
        boolean isDeleteOrder = orderService.deleteOrderById(bl_id);
        if(isDeleteOrder) {
            //成功将订单删除
            List<MyOrder> orderList = orderService.getOrderList();
            model.addAttribute("orderList", orderList);
            //返回
            return "/WEB-INF/Purchase/purchaser_order_manage.jsp";
        } else {
            //订单删除失败
            model.addAttribute("result", "订单删除失败");
            //返回
            return "/WEB-INF/Purchase/purchaser_order_manage.jsp";
        }
    }



    /**
     * 根据订单编号查找订单信息
     * 根据订单编号查找订单中的商品信息
     *
     * @param bl_id
     * @param model
     * @return
     */
    @RequestMapping("/getOrder/{bl_id}")
    public String getOrderById(@PathVariable int bl_id,
                               Model model) {
        //查找订单信息
        MyOrder myOrder = orderService.getOrderById(bl_id);
        //查找对应订单中的商品信息
        List<OrderGoods> orderGoodsList = orderGoodsService.getGoodsList(bl_id);
        if (myOrder != null && orderGoodsList != null) {
            //如果查找成功
            //        向页面返回订单信息
            model.addAttribute("myOrder", myOrder);
            //        向页面返回订单商品信息
            model.addAttribute("orderGoodsList", orderGoodsList);
            return "success";
        } else {
            return "false";
        }
    }


    /**
     * 根据订单编号更新订单信息
     *
     * @param order
     *
     * @param model
     * @return
     */
    @RequestMapping("/updateOrder")
    public String updateOrder(MyOrder order,//订单
                              Model model) {
        /*
        按顺序更新
         */
        boolean isUpdateOrder = orderService.updateOrderById(order);

        if (isUpdateOrder) {
            List<MyOrder> orderList = orderService.getOrderList();
            model.addAttribute("orderList", orderList);
            //返回
            return "/WEB-INF/Purchase/purchaser_order_manage.jsp";
        } else {
            //订单删除失败
            model.addAttribute("result", "订单更新失败");
            //返回
            return "/WEB-INF/Purchase/purchaser_order_manage.jsp";
        }

    }


    /**
     * 返回订单列表--orderList
     *
     * @param model
     * @return orderList
     */
    @RequestMapping("/orderList")
    public String getOrderList(Model model) {


        List<MyOrder> orderList = orderService.getOrderList();

        if (orderList != null) {
            //订单不为空
            model.addAttribute("orderList", orderList);
            return "notNull";
        } else {
            //订单为空
            return "null";
        }
    }


}
