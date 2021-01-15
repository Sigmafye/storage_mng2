package com.ynu.controller;

import com.ynu.pojo.ImportRecord;
import com.ynu.service.ImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/import")
public class IR_Controller {

    @Autowired
    public ImportService importService;

    @RequestMapping(value = "/getIR")
    public String getIRList(Model model){
       List<ImportRecord> IRList= importService.getIRList();
       model.addAttribute("IRList",IRList);
        return "IRShow";
    }


}
