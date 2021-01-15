package com.ynu.controller;

import com.ynu.pojo.WareHouse;
import com.ynu.pojo.WareMnger;
import com.ynu.service.WareHouseService;
import com.ynu.service.WareMngerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/wareHouse")
public class WareHouseController {

    @Autowired
    WareHouseService wareHouseService;

    @RequestMapping("/add")
    public String add(WareHouse wareHouse, Model model){
//        WareMnger wareMnger = new WareMnger();
        if (wareHouseService.add(wareHouse)){
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
        if (wareHouseService.delete(id)){
            model.addAttribute("result", "删除成功");
            return "";
        }
        else {
            model.addAttribute("result", "删除失败");
            return "";
        }

    }

    @RequestMapping("/update")
    public String delete(WareHouse wareHouse, Model model){
        if (wareHouseService.update(wareHouse)){
            model.addAttribute("result", "更新成功");
            return "";
        }
        else {
            model.addAttribute("result", "更新失败");
            return "";
        }
    }

    @RequestMapping("/getHouseList")
    public String getHouseList(Model model){
        List<WareHouse> wareHouseList = wareHouseService.getWareHouseList();
        model.addAttribute("wareHouseList", wareHouseList);
        return "";
    }
}
