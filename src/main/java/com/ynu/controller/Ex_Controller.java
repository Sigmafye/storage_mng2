package com.ynu.controller;


import com.ynu.pojo.Export;
import com.ynu.service.ExService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/export")
public class Ex_Controller {
    @Autowired
    public ExService exService;

    @RequestMapping("/getEX")
    public String getEXList(Model model){
        List<Export> EXList = exService.getEXList();
        model.addAttribute("EXList",EXList);
        return "EXShow";
    }
}
