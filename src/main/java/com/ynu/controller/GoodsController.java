package com.ynu.controller;

import com.ynu.pojo.Goods;
import com.ynu.pojo.Product;
import com.ynu.pojo.Supportor;
import com.ynu.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    /**
     * 添加商品
     * @return
     */
    @RequestMapping("/addPage")
    public String addPage(){
        return "/WEB-INF/Repertory/addcommodity.jsp";
    }


    /**
     * 添加商品页面
     * @return
     */
    @RequestMapping("/addDone")
    public String addDone(Goods goods, Model model){
        System.out.println(goods);
        System.out.println(goodsService.add(goods));
        return "redirect:/goods/getList";

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
            return "redirect:/goods/getList";
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
     *
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

        Iterator<Goods> goodsIterator=goodsList.listIterator();
        //放入set集合
        Set<String> goodsSet =new HashSet<String>();
        while (goodsIterator.hasNext()){
            goodsSet.add(goodsIterator.next().getGs_class());
        }
        model.addAttribute("goodsClassSet",goodsSet);
        model.addAttribute("goodsList", goodsList);
        return "/WEB-INF/Repertory/commodity_manage.jsp";
    }
}
