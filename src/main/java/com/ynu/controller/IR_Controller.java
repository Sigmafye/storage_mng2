package com.ynu.controller;

import com.ynu.pojo.ImportRecord;
import com.ynu.pojo.Repertory;
import com.ynu.service.ImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/import")
public class IR_Controller {

    @Autowired
    public ImportService importService;

    /**
     * 根据前端按钮路径运行获取所有入库单记录的服务模块
     * @param model
     * @return
     */
    @RequestMapping(value = "/getIR")
    public String getIRList(Model model){
       List<ImportRecord> IRList= importService.getIRList();
       model.addAttribute("IRList",IRList);
       return "/WEB-INF/wareManagement/import.jsp";
    }

    /**
     * 根据入库单编号获取入库单记录
     * @param im_id
     * @param model
     * @return
     */
    @RequestMapping(value = "/getIR1")
    public String getIR1(@RequestParam int im_id,
                        Model model){
        System.out.println(im_id);
        ImportRecord importRecord = importService.getIR(im_id);
        System.out.println(importRecord);
        model.addAttribute("importRecord",importRecord);
        return "/WEB-INF/wareManagement/import.jsp";
    }

    /**
     * 增添入库记录
     * @param importRecord
     * @param model
     * @return
     */
    @RequestMapping(value = "/addIR")
    public String addIR(ImportRecord importRecord,Model model){
        if(importService.insertIR(importRecord)){
            model.addAttribute("result","增添成功！");
            return "redirect:/import/getIR";
        }
        else {
            model.addAttribute("result","增添失败，请修改数据后重新增添记录！");
            return "redirect:/import/getIR";
        }
    }

    /**
     * 更新入库记录
     * @param importRecord
     * @param model
     * @return
     */
    @RequestMapping(value = "/updateIR")
    public String updateIR(ImportRecord importRecord,Model model){
        if(importService.updateIR(importRecord)){
            model.addAttribute("result","更新成功！");
            return "redirect:/import/getIR";
        }
        else {
            model.addAttribute("result","更新失败！");
            return "redirect:/import/getIR";
        }
    }

    /**
     * 将修改数据传到修改页面
     * @param im_id
     * @param m_id
     * @param c_id
     * @param im_quantity
     * @param im_time
     * @param im_principal
     * @param im_remarks
     * @param model
     * @return
     */
    @RequestMapping(value = "/transformIR/{im_id}/{m_id}/{c_id}/{im_quantity}/{im_time}/{im_principal}/{im_remarks}")
    public String transformIR(@PathVariable("im_id") int im_id,
                           @PathVariable("m_id") int m_id,
                           @PathVariable("c_id") int c_id,
                           @PathVariable("im_quantity") double im_quantity,
                           @PathVariable("im_time") String im_time,
                           @PathVariable("im_principal") String im_principal,
                           @PathVariable("im_remarks") String im_remarks,
                           Model model){
            ImportRecord importRecord = new ImportRecord(im_id,m_id,c_id,im_quantity,im_time,im_principal,im_remarks);
            System.out.println(importRecord);
            model.addAttribute("importList",importRecord);
            return "/WEB-INF/wareManagement/edit_list.jsp";
        }


    /**
     * 删除入库记录
     * @param im_id
     * @param model
     * @return
     */
    @RequestMapping(value = "/deleteIR/{im_id}")
    public String deleteIR(@PathVariable int im_id ,Model model){
        if(importService.deleteIR(im_id)){
            model.addAttribute("result","删除成功！");
            return "redirect:/import/getIR";
        }
        else {
            model.addAttribute("result","删除失败！");
            return "redirect:/import/getIR";
        }
    }

    @RequestMapping(value = "/repertorySearch")
    public String repertorySearch(@RequestParam String r_name, Model model){
        System.out.println(r_name);



        String newR_name=r_name;
        List<Repertory> repertoryProductList=importService.getProductsRepertoryList();
        Iterator<Repertory> repertoryProductIterator =repertoryProductList.listIterator();

        List<Repertory> repertoryGoodsList=importService.getGoodsRepertoryList();
        Iterator<Repertory> repertoryGoodsIterator =repertoryGoodsList.listIterator();


        //实例化一个集合list
        List<Repertory> repertoryList=new ArrayList<Repertory>();

        //迭代器
        while (repertoryProductIterator.hasNext()){
            Repertory repertoryProduct=repertoryProductIterator.next();

            String p_name=repertoryProduct.r_name;

            String r =".*"+newR_name+".*";//输入匹配


            boolean isMatch = Pattern.matches(r,p_name);//是否匹配成功
            if(isMatch){
                //匹配成功
                repertoryList.add(repertoryProduct);
            }
        }


        while (repertoryGoodsIterator.hasNext()){
            Repertory repertoryGoods=repertoryGoodsIterator.next();

            String g_name=repertoryGoods.r_name;
            String r =".*"+newR_name+".*";
            boolean isMatch = Pattern.matches(r,g_name);//是否匹配成功
            if(isMatch){
                //匹配成功
                repertoryList.add(repertoryGoods);
            }
        }


        System.out.println(repertoryList);
        model.addAttribute("repertoryList",repertoryList);
        return "/WEB-INF/Repertory/Inventory_statistics_query.jsp";
    }








}
