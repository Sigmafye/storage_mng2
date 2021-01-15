package com.ynu.controller;

import com.ynu.pojo.WareMnger;
import com.ynu.service.WareMngerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/wareMnger")
public class WareMngerController {
    @Autowired
    WareMngerService wareMngerService;

    /**
     * 登录验证
     * @return
     */
    @RequestMapping("/validate")
    public String validate(){

        WareMnger wareMnger = new WareMnger();
        if (wareMngerService.validate(wareMnger) != null){
            return "success";
        }
        else {
            return "fail";
        }
    }

    /**
     * 添加仓储管理员
     * @param wareMnger
     * @param model
     * @return
     */
    @RequestMapping("/add")
    public String add(WareMnger wareMnger, Model model){
//        WareMnger wareMnger = new WareMnger();
        if (wareMngerService.add(wareMnger)){
            model.addAttribute("result", "插入成功");
            return "";
        }
        else {
            model.addAttribute("result", "插入失败");
            return "";
        }
    }

    /**
     * 删除库存管理员
     * @param id
     * @return
     */
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        wareMngerService.delete(id);
        return "";
    }

    /**
     * 更新仓库管理员
     * @param wareMnger
     * @param model
     * @return
     */
    @RequestMapping("/update")
    public String delete(WareMnger wareMnger, Model model){
        if (wareMngerService.update(wareMnger)){
            model.addAttribute("result", "更新成功");
            return "";
        }
        else {
            model.addAttribute("result", "更新失败");
            return "";
        }
    }

    /**
     * 获得管理员列表
     * @param model
     * @return
     */
    @RequestMapping("/getMngerList")
    public String getMngerList(Model model){
        List<WareMnger> wareMngerList = wareMngerService.getWareMngerList();
        model.addAttribute("wareMngerList", wareMngerList);
        return "";
    }
}
