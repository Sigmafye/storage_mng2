package com.ynu.controller;


import com.ynu.pojo.Export;
import com.ynu.pojo.ImportRecord;
import com.ynu.service.ExService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/export")
public class Ex_Controller {
    @Autowired
    public ExService exService;


    /**
     * 获取所有出库单记录
     * @param model
     * @return
     */
    @RequestMapping("/getExportAll")
    public String getEXList(Model model){
        List<Export> EXList = exService.getEXList();
        System.out.println(EXList);
        model.addAttribute("EXList",EXList);
        return "/WEB-INF/wareManagement/export.jsp";
    }


    /**
     * 根据出库单编号获取特定出库单记录
     * @param ex_id
     * @param model
     * @return
     */
    @RequestMapping(value = "/getExport")
    public String getIR(@RequestParam int ex_id,
                        Model model){
        System.out.println(ex_id);
        Export export = exService.getEX(ex_id);
        System.out.println(export);
        model.addAttribute("export",export);
        return "/WEB-INF/wareManagement/export.jsp";
    }

    /**
     * 增添出库记录
     * @param export
     * @param model
     * @return
     */
    @RequestMapping(value = "/addExport")
    public String addExport(Export export,Model model){
        if(exService.insertEX(export)){
            model.addAttribute("result","增添成功！");
            return "redirect:/export/getExportAll";
        }
        else {
            model.addAttribute("result","增添失败，请修改数据后重新增添记录！");
            return "redirect:/export/getExportAll";
        }
    }

    /**
     * 更新出库记录
     * @param export
     * @param model
     * @return
     */
    @RequestMapping(value = "/updateExport")
    public String updateExport(Export export,Model model){
        if(exService.updateEX(export)){
            model.addAttribute("result","更新成功！");

            return "redirect:/export/getExportAll";
        }
        else {
            model.addAttribute("result","更新失败！");
            return "redirect:/export/getExportAll";
        }
    }

    @RequestMapping(value = "/transformExport/{ex_id}/{m_id}/{c_id}/{ex_quantity}/{ex_time}/{ex_principal}/{ex_remarks}")
    public String transformExport(@PathVariable("ex_id") int ex_id,
                              @PathVariable("m_id") int m_id,
                              @PathVariable("c_id") int c_id,
                              @PathVariable("ex_quantity") double ex_quantity,
                              @PathVariable("ex_time") String ex_time,
                              @PathVariable("ex_principal") String ex_principal,
                              @PathVariable("ex_remarks") String ex_remarks,
                              Model model){
        Export export = new Export(ex_id,m_id,c_id,ex_quantity,ex_time,ex_principal,ex_remarks);
        System.out.println(export);
        model.addAttribute("exportList",export);
        return "/WEB-INF/wareManagement/edit_export.jsp";
    }

    /**
     * 删除出库记录
     * @param ex_id
     * @param model
     * @return
     */
    @RequestMapping(value = "deleteExport/{ex_id}")
    public String deleteExport(@PathVariable int ex_id ,Model model){
        if(exService.deleteEX(ex_id)){
            model.addAttribute("result","删除成功！");
            return "redirect:/export/getExportAll";
        }
        else {
            model.addAttribute("result","删除失败！");
            return "redirect:/export/getExportAll";
        }
    }
}
