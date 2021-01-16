package com.ynu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goto")
public class NavigateController {

    @RequestMapping("/purchaseMng")
    public String gotoPurchaseMng(){
        return "/WEB-INF/Purchase/purchaser_order_manage.jsp";
    }

    @RequestMapping("/buyStatis")
    public String gotoBuyStatis(){
        return "/WEB-INF/User/index.jsp";
    }

    @RequestMapping("editProduct")
    public String gotoeditProduct() {
        return "/WEB-INF/Repertory/editproduct.jsp";
    }

    @RequestMapping("/addGoods")
    public String gotoAddGoods(){
        return "/WEB-INF/Purchaser/add_purchaser_order.jsp";
    }

    @RequestMapping("/goodsMng")
    public String gotoGoodsMng(){
        return "/WEB-INF/Repertory/commodity_manage.jsp";
    }

    @RequestMapping("/proMng")
    public String gotoProMng(){
        return "/WEB-INF/Repertory/product_manage.jsp";
    }

    @RequestMapping("/importMng")
    public String gotoImportMng(){
        return "/WEB-INF/wareManagement/import.jsp";
    }

    @RequestMapping("/exportMng")
    public String gotoExportMng(){
        return "/WEB-INF/wareManagement/export.jsp";
    }

    @RequestMapping("/roleMng")
    public String gotoWareStatis(){
        return "/WEB-INF/User/index.jsp";
    }

}
