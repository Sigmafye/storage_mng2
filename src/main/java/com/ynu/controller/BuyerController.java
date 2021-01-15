package com.ynu.controller;


import com.ynu.pojo.Buyer;
import com.ynu.pojo.MyOrder;
import com.ynu.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller

@RequestMapping("/buyer")
public class BuyerController {


    @Autowired
    private BuyerService buyerService;//采购员服务


    /**
     * 返回所有采购员编号
     * @param model
     * @return
     */
    @RequestMapping("/buyerIdList")
    public String getBuyerIdList(Model model){
        List<Integer> buyerIdList= buyerService.getBuyerIdList();
        if(buyerIdList!=null){
            //采购员编号不为空
            model.addAttribute("buyerIdList",buyerIdList);
            return "notNull";
        }else {
            //返回列表为空
            return "null";
        }
    }


    /**
     * 根据采购员编号查找与该采购员相关的订单信息
     * @param u_id
     * @param model
     * @return
     */
    @RequestMapping("/buyerOrderList/{u_id}")
    public String getBuyerOrderList(@PathVariable int u_id,
                                    Model model){
        List<MyOrder> buyerOrderList= buyerService.getBuyerOrderList(u_id);
        if (buyerOrderList!=null){
            //该采购员有自己负责的订单
            model.addAttribute("buyerOrderList",buyerOrderList);
            return "isHave";
        }else {
            //该采购员没有自己负责的订单
            return "null";
        }
    }


    /**
     * 采取级联的方式
     * 根据采购员编号删除采购员及其对应的信息
     * @param u_id
     * @return
     */
    @RequestMapping("/deleteBuyer/{u_id}")
    public String deleteBuyerById(@PathVariable int u_id){
        boolean isDeleteBuyer=buyerService.deleteBuyerById(u_id);
        if (isDeleteBuyer){
            //删除成功
            return "success";
        }else{
            //删除失败
            return "false";
        }
    }


    /**
     * 判断采购员登录是否成功
     * @param buyer
     * @return
     */
    @RequestMapping("/validate")
    public String isValidateBuyer(Buyer buyer){
        boolean isValidate=buyerService.isValidBuyer(buyer);
        if (isValidate){
            //验证通过
            return "success";
        }else {
            //验证失败
            return "failure";
        }
    }









}
