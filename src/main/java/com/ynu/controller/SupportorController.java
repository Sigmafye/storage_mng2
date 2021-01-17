package com.ynu.controller;


import com.ynu.pojo.MyOrder;
import com.ynu.pojo.Supportor;
import com.ynu.service.SupportorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
@RequestMapping("/supportor")
public class SupportorController {


    @Autowired
    private SupportorService supportorService;//供应商服务


    /**
     * 返回所有供应商信息列表
     * @param model
     * @return
     */
    @RequestMapping("/supportorList")
    public String getSupportorList(Model model){
        List<Supportor> supportorList=supportorService.getSupportorList();
        if(supportorList!=null){
            //供应商列表不为空
            model.addAttribute("supportorList",supportorList);
            return "success";
        }else{
            //供应商列表为空
            return "null";
        }
    }


    /**
     * 根据供应商编号返回所有相关的订单信息
     * @param s_id
     * @param model
     * @return
     */
    @RequestMapping("/supportorOrderList/{s_id}")
    public String getsupportorOrderList(@PathVariable int s_id,
                                        Model model){
        List<MyOrder> supportorOrderList=supportorService.getSupportorOrderList(s_id);
        if (supportorOrderList!=null){
            //供应商对应的订单不为空
            model.addAttribute("supportorOrderList",supportorOrderList);
            return "success";

        }else {
            //供应商对应的订单信息为空
            return "null";
        }
    }

    /**
     * 增加供应商
     */
    @RequestMapping("/addSupportor")
    public String addSupportor(@RequestParam Supportor supportor){
        boolean isAdd=supportorService.addSupportor(supportor);
        if (isAdd){
            //添加成功
            return "success";
        }else {
            //添加失败
            return "failure";
        }
    }

    /**
     * 根据供应商编号删除供应商
     * @param s_id
     * @return
     */
    @RequestMapping("/deleteSupportorById/{s_id}")
    public String deleteSupportorById(@PathVariable int s_id){
        boolean isDelete=supportorService.deleteSupportor(s_id);
        if (isDelete){
            //删除成功
            return "success";
        }else{
            //删除失败
            return "failure";
        }
    }



}
