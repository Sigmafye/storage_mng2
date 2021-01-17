package com.ynu.controller;

import com.ynu.pojo.SuperMnger;
import com.ynu.service.SuperMngerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/super")
public class SuperMngerController {

    @Autowired
    SuperMngerService superMngerService;

    @RequestMapping("/addPage")
    public String addPage(){
        return "/WEB-INF/User/add_user.jsp";
    }

    @RequestMapping("/doAdd")
    public String doAdd(SuperMnger superMnger, Model model){
        superMngerService.add(superMnger);
        return "redirect:/super/getList";
    }

    @RequestMapping("/getList")
    public String getList(Model model){
        List<SuperMnger> superMngerList = superMngerService.getSuperList();
        model.addAttribute("superList", superMngerList);
        return "/WEB-INF/User/index.jsp";
    }

    @RequestMapping("/updatePage/{id}")
    public String updatePage(@PathVariable("id") int id, Model model){
        SuperMnger superMnger = superMngerService.search(id);
        System.out.println(superMnger);
        model.addAttribute("superMnger", superMnger);
        return "/WEB-INF/User/edit_user.jsp";
    }

    @RequestMapping("/doUpdate")
    public String doUpdate(SuperMnger superMnger){
        superMngerService.update(superMnger);
        return "redirect:/super/getList";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        superMngerService.delete(id);
        return "redirect:/super/getList";
    }

}
