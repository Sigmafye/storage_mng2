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
     *
     * @param model
     * @return
     */
    @RequestMapping("/getIdList")
    public String getBuyerIdList(Model model) {
        List<Integer> buyerIdList = buyerService.getBuyerIdList();
        if (buyerIdList != null) {
            //采购员编号不为空
            model.addAttribute("buyerIdList", buyerIdList);
            return "notNull";
        } else {
            //返回列表为空
            return "null";
        }
    }


    /**
     * 根据采购员编号查找与该采购员相关的订单信息
     *
     * @param u_id
     * @param model
     * @return
     */
    @RequestMapping("/orderList/{u_id}")
    public String getBuyerOrderList(@PathVariable int u_id,
                                    Model model) {
        List<MyOrder> buyerOrderList = buyerService.getBuyerOrderList(u_id);
        if (buyerOrderList != null) {
            //该采购员有自己负责的订单
            model.addAttribute("buyerOrderList", buyerOrderList);
            return "isHave";
        } else {
            //该采购员没有自己负责的订单
            return "null";
        }
    }


    /**
     * 采取级联的方式
     * 根据采购员编号删除采购员及其对应的信息
     *
     * @param u_id
     * @return
     */
    @RequestMapping("/deleteBuyer/{u_id}")
    public String deleteBuyerById(@PathVariable int u_id) {
        buyerService.deleteBuyerById(u_id);
        return "redirct:/buyer/getBuyerList";
    }


    /**
     * 判断采购员登录是否成功
     *
     * @param buyer
     * @return
     */
    @RequestMapping("/validate")
    public String isValidateBuyer(Buyer buyer) {
        boolean isValidate = buyerService.isValidBuyer(buyer);
        if (isValidate) {
            //验证通过
            return "success";
        } else {
            //验证失败
            return "failure";
        }
    }

    /**
     * 返回所有采购员
     *
     * @param
     * @return
     */
    @RequestMapping("/getBuyerList")
    public String getBuyerList(Model model) {
        List<Buyer> buyerList = buyerService.getBuyerList();
        model.addAttribute("buyerList", buyerList);
        return "/WEB-INF/User/buyer.jsp";
    }

    /**
     * 添加采购员页面
     *
     * @return
     */
    @RequestMapping("/addPage")
    public String addPage() {
        return "";
    }

    @RequestMapping("/addBuyerDone")
    public String addBuyerDone(@RequestParam Buyer buyer) {
        buyerService.addBuyerById(buyer);
        return "redirct:/buyer/getBuyerList";
    }


    @RequestMapping("/updatePage/{id}")
    public String updatePage(@PathVariable("id") int id, Model model){
        model.addAttribute("buyer", buyerService.getBuyerInfo(id));
        return "";
    }

    @RequestMapping("/updateDone")
    public String updateDone(Buyer buyer){
        buyerService.updateBuyerInfo(buyer);
        return "redirct:/buyer/getBuyerList";
    }


}
