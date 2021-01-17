package com.ynu.controller;

import com.ynu.pojo.Goods;
import com.ynu.pojo.Product;
import com.ynu.pojo.WareHouse;
import com.ynu.service.ProductService;
import com.ynu.service.WareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    /**
     * 添加产品
     *
     * @return
     */
    @RequestMapping("/addPage")
    public String addPage() {
        return "/WEB-INF/Repertory/addproduct.jsp";
    }

    @RequestMapping("/addDone")
    public String addDone(Product product, Model model) {
        System.out.println(product);
        productService.add(product);
//        model.addAttribute("product", product);
        return "redirect:/product/getList";
    }

    /**
     * 删除产品
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id, Model model) {
        productService.delete(id);
        return "redirect:/product/getList";

    }

    /**
     * 更新产品
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/updatePage/{id}")
    public String updatePage(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", productService.search(new Product(id)));
        return "/WEB-INF/Repertory/editproduct.jsp";

    }

    @RequestMapping("/updateDone")
    public String updateDone(Product product) {
        productService.update(product);
        return "redirect:/product/getList";

    }

    /**
     * 获得产品列表
     *
     * @param model
     * @return
     */
    @RequestMapping("/getList")
    public String getList(Model model) {
        List<Product> productList = productService.getProductList();

        Iterator<Product> productIterator=productList.listIterator();
        //放入set集合
        Set<String> productNameSet =new HashSet<String>();
        while (productIterator.hasNext()){
            productNameSet.add(productIterator.next().getP_type());
        }
        model.addAttribute("productList", productList);
        model.addAttribute("productClassList", productNameSet);
        return "/WEB-INF/Repertory/product_manage.jsp";
    }


    @RequestMapping("/searchByName")
    public String searchByName(Model model,
                               @RequestParam String productname){

        System.out.println(productname);

        List<Product> productList2=productService.searchByName(productname);

        System.out.println(productList2);

        List<Product> productList = productService.getProductList();
        Iterator<Product> productIterator=productList.listIterator();
        //放入set集合
        Set<String> productNameSet =new HashSet<String>();
        while (productIterator.hasNext()){
            productNameSet.add(productIterator.next().getP_type());
        }

        model.addAttribute("productClassList", productNameSet);
        model.addAttribute("productList", productList2);
        return "/WEB-INF/Repertory/product_manage.jsp";



    }

}
