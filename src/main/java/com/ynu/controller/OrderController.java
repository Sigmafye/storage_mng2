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
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/Order")
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
     * @param order 订单信息
     * @param buyer 采购员
     * @param supportor 供应商
     * @return
     */
    @RequestMapping("/addOrder")
    public String addOrderInfo(MyOrder order,//订单
                               Buyer buyer,//采购员
                               Supportor supportor,//供应商
                               Model model){

        /*先添加采购员--buyer
          再添加供应商--supportor
          添加订单表--buy_list
          添加采购商品表--gds_tobuy
         */
        boolean isAddBuyer=buyerService.addBuyerById(buyer);
        boolean isAddSupportor=supportorService.addSupportor(supportor);
        boolean isAddOrder=orderService.addOrder(order);
        /*
        检查是否添加成功
         */
        if(isAddBuyer && isAddSupportor && isAddOrder ){
            //创建订单成功
            //返回当前订单中已有的商品
            List<OrderGoods> orderGoodsList=orderGoodsService.getGoodsList(order.getBl_id());
            model.addAttribute("orderGoodsList",orderGoodsList);

            return "success";

        }else{
            //创建订单失败
            return "fuilure";
        }
    }


    /**
     * 根据订单编号向订单中添加商品
     * @param bl_id
     * @return
     */
    @RequestMapping("/addOrderGoods/{bl_id}")
    public String addOrderGoods(@PathVariable int bl_id,//订单编号不能为空
                                OrderGoods orderGoods){


        orderGoods.setBl_id(bl_id);//向对应订单中添加商品

        boolean isAddGoods=orderGoodsService.addGoodsById(orderGoods);
        if(isAddGoods ){
            return "success";//创建订单成功
        }else{
            return "fuilure";//创建订单失败
        }

    }




    @RequestMapping("/deleteOrder")
    public String deleteOrder(){
        return "pass";
    }


}
