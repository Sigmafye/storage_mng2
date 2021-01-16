package com.ynu.controller;

import com.ynu.pojo.MyOrder;
import com.ynu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/goto")
public class NavigateController {


    @Autowired
    private OrderService orderService;


    /*
    采购管理
     */
    @RequestMapping("/purchaseMng")
    public String gotoPurchaseMng(Model model){
        List<MyOrder> orderList=orderService.getOrderList();
        model.addAttribute("orderList",orderList);
        System.out.println(orderList);
        return "/WEB-INF/Purchase/purchaser_order_manage.jsp";
    }

    /*
    采购统计查询
     */
    @RequestMapping("/buyStatis")
    public String gotoBuyStatis(){
        return "/WEB-INF/Purchase/Purchase_statistics_inquiry.jsp";
    }

    /*
    修改产品
     */
    @RequestMapping("editProduct")
    public String gotoeditProduct() {
        return "/WEB-INF/Repertory/editproduct.jsp";
    }

    /*
    添加商品
     */
    @RequestMapping("/addGoods")
    public String gotoAddGoods(){
        return "/WEB-INF/Purchaser/add_purchaser_order.jsp";
    }

    /**
     * 商品管理
     * @return
     */
    @RequestMapping("/goodsMng")
    public String gotoGoodsMng(){
        return "/WEB-INF/Repertory/commodity_manage.jsp";
    }

    /*
    产品管理
     */
    @RequestMapping("/proMng")
    public String gotoProMng(){
        return "/WEB-INF/Repertory/product_manage.jsp";
    }

    /*
    入库管理
     */
    @RequestMapping("/importMng")
    public String gotoImportMng(){
        return "/WEB-INF/wareManagement/import.jsp";
    }

    /*
    出库管理
     */
    @RequestMapping("/exportMng")
    public String gotoExportMng(){
        return "/WEB-INF/wareManagement/export.jsp";
    }

    /*
    库存统计查询
     */
    @RequestMapping("/wareStatis")
    public String gotoWareStatis(){
        return "/WEB-INF/Repertory/Inventory_statistics_query.jsp";
    }
    /*
    超级管理员
     */
    @RequestMapping("/userMng")
    public String gotouserMng(){
        return "/WEB-INF/User/index.jsp";
    }


    /*
    跳转添加采购单
     */
    @RequestMapping("/addPurchaseOrder")
    public String gotoAddPurchaseOrder(){
        return "/WEB-INF/Purchase/add_purchaser_order.jsp";
    }

    /*
    采购员
     */
    @RequestMapping("/buyer")
    public String gotobuyer(){
        return "/WEB-INF/User/buyer.jsp";
    }
    /*
    仓库管理员
     */
    @RequestMapping("/manager")
    public String gotomanager(){
        return "/WEB-INF/User/manager.jsp";
    }


}
