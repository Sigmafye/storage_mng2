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
                                OrderGoods orderGoods){//商品类

        MyOrder myOrder=orderService.getOrderById(bl_id);
        if(myOrder==null){
            //无该订单信息，需要先添加订单信息。
            return "failure";
        }else{
            //存在该订单
            orderGoods.setBl_id(bl_id);//向对应订单中添加商品
            boolean isAddGoods=orderGoodsService.addGoodsById(orderGoods);
            if(isAddGoods ){
                //创建订单成功
                return "success";
            }else{
                //创建订单失败
                return "fuilure";
            }
        }
    }


    /**
     * 根据订单编号删除订单，
     * 先删除订单中的商品
     * 再删除订单信息
     * @return
     */
    @RequestMapping("/deleteOrder/{bl_id}")
    public String deleteOrder(@PathVariable int bl_id){
        boolean isDeleteGoods=orderGoodsService.deleteOrderGoods(bl_id);
        if (isDeleteGoods){
            //成功将商品删除
            boolean isDeleteOrder=orderService.deleteOrderById(bl_id);
            if (isDeleteOrder){
                //成功将订单删除
                return "success";
            }else {
                //订单删除失败
                return "false";
            }
        }else {
            //商品删除失败
            return "false";
        }
    }



    /**
     * 根据订单编号查找订单信息
     * 根据订单编号查找订单中的商品信息
     * @param bl_id
     * @param model
     * @return
     */
    @RequestMapping("/getOrder/{bl_id}")
    public String getOrder(@PathVariable int bl_id,
                           Model model){
        //查找订单信息
        MyOrder myOrder=orderService.getOrderById(bl_id);
        //查找对应订单中的商品信息
        List<OrderGoods> orderGoodsList=orderGoodsService.getGoodsList(bl_id);
        if (myOrder!=null&&orderGoodsList!=null){
            //如果查找成功
            //        向页面返回订单信息
            model.addAttribute("myOrder",myOrder);
            //        向页面返回订单商品信息
            model.addAttribute("orderGoodsList",orderGoodsList);
            return "success";
        }else{
            return "false";
        }
    }


    /**
     * 根据订单编号更新订单信息
     * @param order
     * @param buyer
     * @param supportor
     * @param model
     * @return
     */
    @RequestMapping("/updateOrder")
    public String updateOrder(MyOrder order,//订单
                              Buyer buyer,//采购员
                              Supportor supportor,//供应商
                              Model model){


        return "false";

    }


}
