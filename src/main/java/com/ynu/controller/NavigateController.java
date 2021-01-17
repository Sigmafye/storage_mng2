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
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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

        List<Supportor> supportorList=supportorService.getSupportorList();
        Iterator<Supportor> supportorIterator=supportorList.listIterator();
        //放入set集合
        Set<Supportor> supportorSet =new HashSet<Supportor>();
        while (supportorIterator.hasNext()){
            supportorSet.add(supportorIterator.next());
        }
        model.addAttribute("supportorList",supportorSet);
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
    添加订货商品
     */
    @RequestMapping("/addGoods/{bl_id}")
    public String gotoAddGoods(@PathVariable int bl_id,
                               Model model){
        //List<OrderGoods> orderGoodsList =orderGoodsService.getOrderGoodsList();
        model.addAttribute("bl_id",bl_id);
        //model.addAttribute("goodsList",orderGoodsList);
        return "/WEB-INF/Purchase/add_commodity.jsp";
    }


    /*
    更新订货商品
     */
    @RequestMapping("/updateGoods/{g_id}/{bl_id}")
    public String updateGoods(@PathVariable int g_id,
                              @PathVariable int bl_id,
                              Model model){

        System.out.println("g_id"+g_id+"bl_id"+bl_id);
        OrderGoods orderGoods=orderGoodsService.getOrderGoodsByGidBlId(g_id,bl_id);
        model.addAttribute("ordergoods",orderGoods);
        return "/WEB-INF/Purchase/updateGoods.jsp";
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
        return "redirect:/product/getList";
    }

    /*
    入库管理
     */
    @RequestMapping("/importMng")
    public String gotoImportMng(){
        return "redirect:/import/getIR";
    }

    /*
    出库管理
     */
    @RequestMapping("/exportMng")
    public String gotoExportMng(){
        return "redirect:/export/getExportAll";
    }

    /*
    增添入库记录
     */
    @RequestMapping("/addImport")
    public String addImport(){
        return "/WEB-INF/wareManagement/addGoods_export.jsp";
    }

    /*
   修改入库记录
    */
    @RequestMapping("/updateImport")
    public String updateImport(){
        return "/WEB-INF/wareManagement/edit_list.jsp";
    }

    /*
   增添出库记录
    */
    @RequestMapping("/addExport")
    public String updateExport(){
        return "/WEB-INF/wareManagement/addGoods_import.jsp";
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
        return "redirect:/super/getList";
    }


    /*
    跳转添加采购单
     */
    @RequestMapping("/addPurchaseOrder")
    public String gotoAddPurchaseOrder(Model model){

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
    跳转更新采购单
     */
    @RequestMapping("/updateOrder/{bl_id}")
    public String updateOrder(@PathVariable int bl_id,
                              Model model){

        //供应商列表
        List<Supportor> supportorList=supportorService.getSupportorList();
        //System.out.println(supportorList);
        model.addAttribute("supportorList",supportorList);

        //采购员
        List<Buyer> buyerList=buyerService.getBuyerList();
        //System.out.println(buyerList);
        model.addAttribute("buyerList",buyerList);

        //对应订单
        MyOrder order =orderService.getOrderById(bl_id);
        model.addAttribute("order",order);
        return "/WEB-INF/Purchase/edit_purchaser.jsp";
    }

    /*
    跳转查看订单商品
     */
    @RequestMapping("/addOrderGoods/{bl_id}")
    public String addOrderGoods(@PathVariable int bl_id,//订单编号不能为空
                                Model model) {//商品类

        //根据订单编号查找对应订单信息
        System.out.println("navidate :"+bl_id);
        MyOrder myOrder = orderService.getOrderById(bl_id);

        //商品信息
        List<OrderGoods> orderGoodsList=orderGoodsService.getGoodsList(bl_id);
        System.out.println(orderGoodsList);
        if (myOrder == null) {
            //无该订单信息，需要先添加订单信息。
            return "failure";
        } else {
            //存在该订单
            model.addAttribute("order", myOrder);
            model.addAttribute("goodsList",orderGoodsList);
            return "/WEB-INF/Purchase/add_purchaser_order.jsp";
        }
    }



    /*
    采购员
     */
    @RequestMapping("/buyer")
    public String gotobuyer(){
        return "redirect:/buyer/getBuyerList";
    }
    /*
    仓库管理员
     */
    @RequestMapping("/manager")
    public String gotomanager(){
        return "redirect:/wareMnger/getMngerList";
    }



    /*
    添加商品完成
     */
    @RequestMapping("/successSave")
    public String successSave(Model model){
        List<MyOrder> orderList=orderService.getOrderList();
        model.addAttribute("orderList",orderList);
        return "/WEB-INF/Purchase/purchaser_order_manage.jsp";
    }
}
