package com.ynu.controller;

import com.ynu.pojo.Product;
import com.ynu.pojo.WareHouse;
import com.ynu.service.ProductService;
import com.ynu.service.WareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/add")
    public String add(Product product, Model model){
//        WareMnger wareMnger = new WareMnger();
        if (productService.add(product)){
            model.addAttribute("result", "插入成功");
            return "";
        }
        else {
            model.addAttribute("result", "插入失败");
            return "";
        }
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id, Model model){
        if (productService.delete(id)){
            model.addAttribute("result", "删除成功");
            return "";
        }
        else {
            model.addAttribute("result", "删除失败");
            return "";
        }

    }

    @RequestMapping("/update")
    public String delete(Product product, Model model){
        if (productService.update(product)){
            model.addAttribute("result", "更新成功");
            return "";
        }
        else {
            model.addAttribute("result", "更新失败");
            return "";
        }
    }

    @RequestMapping("/getList")
    public String getList(Model model){
        List<Product> productList = productService.getProductList();
        model.addAttribute("productList", productList);
        return "";
    }

}
