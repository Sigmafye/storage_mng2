package com.ynu.controller;

import com.ynu.pojo.Goods;
import com.ynu.pojo.Product;
import com.ynu.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    /**
     * 添加商品
     * @param goods
     * @param model
     * @return
     */
    @RequestMapping("/add")
    public String add(Goods goods, Model model){
//        WareMnger wareMnger = new WareMnger();
        if (goodsService.add(goods)){
            model.addAttribute("result", "插入成功");
            return "";
        }
        else {
            model.addAttribute("result", "插入失败");
            return "";
        }
    }

    /**
     * 删除某个商品
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id, Model model){
        if (goodsService.delete(id)){
            model.addAttribute("result", "删除成功");
            return "";
        }
        else {
            model.addAttribute("result", "删除失败");
            return "";
        }

    }

    /**
     * 准备跳转更新商品页面
     * @param id
     * @return
     */
    @RequestMapping("/update/{gs_id}")
    public String update(@PathVariable("gs_id") int id, Model model){
        Goods goods = goodsService.search(new Goods(id));
        model.addAttribute("goods", goods);
        return "/WEB-INF/Repertory/editcommodity.jsp";

    }

    /**
     * 更新商品页面
     * @param goods
     * @param model
     * @return
     */
    @RequestMapping("/doUpdate")
    public String doUpdate(Goods goods){
        System.out.println(goods);
        goodsService.update(goods);
        return "redirect:/goods/getList";

    }

    /**
     * 获得商品列表
     * @param model
     * @return
     */
    @RequestMapping("/getList")
    public String getList(Model model){
        List<Goods> goodsList = goodsService.getGoodsList();
        model.addAttribute("goodsList", goodsList);
        return "/WEB-INF/Repertory/commodity_manage.jsp";
    }
}
