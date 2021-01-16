package com.ynu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goto")
public class NavigateController {

    /*
    采购管理
     */
    @RequestMapping("/purchaseMng")
    public String gotoPurchaseMng(){
        return "/WEB-INF/Purchase/purchaser_order_manage.jsp";
    }

    /*
    采购统计查询
     */
    @RequestMapping("/buyStatis")
    public String gotoBuyStatis(){
        return "/WEB-INF/User/index.jsp";
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
        return "redirect:/goods/getList";
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
        return "/WEB-INF/User/index.jsp";
    }

}
