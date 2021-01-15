package com.ynu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goto")
public class NavigateController {

    @RequestMapping("/purchaseMng")
    public String gotoPurchaseMng(){
        return "/WEB-INF/Purchase/purchaser_order_manage.html";
    }

    @RequestMapping("/buyStatis")
    public String gotoBuyStatis(){
        return "/WEB-INF/Role/index.html";
    }

    @RequestMapping("/addGoods")
    public String gotoAddGoods(){
        return "/WEB-INF/Purchaser/add_purchaser_order.jsp";
    }

    @RequestMapping("/goodsMng")
    public String gotoGoodsMng(){
        return "/WEB-INF/Repertory/commodity_manage.html";
    }

    @RequestMapping("/proMng")
    public String gotoProMng(){
        return "/WEB-INF/Repertory/product_manage.html";
    }

    @RequestMapping("/importMng")
    public String gotoImportMng(){
        return "/WEB-INF/Menu/index.html";
    }

    @RequestMapping("/exportMng")
    public String gotoExportMng(){
        return "/WEB-INF/Node/index.html";
    }

    @RequestMapping("/wareStatis")
    public String gotoWareStatis(){
        return "/WEB-INF/Role/index.html";
    }

}
