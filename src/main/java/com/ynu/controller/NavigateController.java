package com.ynu.controller;

import com.ynu.pojo.Buyer;
import com.ynu.pojo.MyOrder;
import com.ynu.pojo.OrderGoods;
import com.ynu.pojo.Supportor;
import com.ynu.service.BuyerService;
import com.ynu.service.OrderGoodsService;
import com.ynu.service.OrderService;
import com.ynu.service.SupportorService;
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

    @Autowired
    private OrderGoodsService orderGoodsService;

    @Autowired
    private SupportorService supportorService;

    @Autowired
    private BuyerService buyerService;


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
        return "/WEB-INF/role/index.jsp";
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
    public String gotoAddPurchaseOrder(Model model){
        //所有商品
        List<OrderGoods> orderGoodsList=orderGoodsService.getOrderGoodsList();
        //System.out.println(orderGoodsList);
        model.addAttribute("goodsList",orderGoodsList);

        //供应商列表
        List<Supportor> supportorList=supportorService.getSupportorList();
        //System.out.println(supportorList);
        model.addAttribute("supportorList",supportorList);

        //采购员
        List<Buyer> buyerList=buyerService.getBuyerList();
        //System.out.println(buyerList);
        model.addAttribute("buyerList",buyerList);
        return "/WEB-INF/Purchase/edit_purchaser_order.jsp";
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
