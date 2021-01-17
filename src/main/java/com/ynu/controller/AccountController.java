package com.ynu.controller;



import com.ynu.pojo.Buyer;
import com.ynu.pojo.MyOrder;
import com.ynu.pojo.SuperMnger;
import com.ynu.pojo.WareMnger;
import com.ynu.service.BuyerService;
import com.ynu.service.OrderService;
import com.ynu.service.SuperMngerService;
import com.ynu.service.WareMngerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private WareMngerService wareMngerService;//库存管理员服务

    @Autowired
    private BuyerService buyerService;//采购管理员服务

    @Autowired
    private OrderService orderService;//订单服务

    @Autowired
    private WareMnger wareMnger;

    @Autowired
    private Buyer buyer;

    @Autowired
    private SuperMnger superMnger;

    @Autowired
    private SuperMngerService superMngerService;


    /**
     * 登录验证，首先将登录身份分类
     * 然后跳转到各自的身份验证函数
     * @param optionsRadios
     * @return
     */
    @RequestMapping("/login")
    public String loginValid(@RequestParam String optionsRadios,
                             @RequestParam String username,
                             @RequestParam String password,
                             Model model){



        if (optionsRadios.equals("option1")){
            //库存管理员
            System.out.println("库存管理员");
            //库存管理员的类封装
            wareMnger.setM_name(username);
            wareMnger.setM_password(password);

            //身份验证
            if(wareMngerService.validate(wareMnger)!=null) {
                //验证通过
                model.addAttribute("username", username);
                return "/WEB-INF/managerHome.jsp";//转到仓库管理员函数
            }else {
                //验证失败
                model.addAttribute("result","用户名或密码错误");
                return "/WEB-INF/login.jsp";
            }
        }else if (optionsRadios.equals("option2")){
            //采购管理员
            System.out.println("采购管理员");
            //采购员类封装
            buyer.setU_name(username);
            buyer.setU_password(password);
            //身份验证
            if(buyerService.isValidBuyer(buyer)) {
                //验证通过
                model.addAttribute("username", username);
                return "/WEB-INF/buyerHome.jsp";//转到采购管理员函数
            }else{
                //验证失败
                model.addAttribute("result","用户名或密码错误");
                return "/WEB-INF/login.jsp";
            }
        }else if(optionsRadios.equals("option3")){
            //超级管理员
            System.out.println("超级管理员");
            if(superMngerService.validate(new SuperMnger(username, password)) != null){
                model.addAttribute("username", username);
                return "/WEB-INF/index.jsp";
            }else{
                model.addAttribute("result","用户名或密码错误");
                return "/WEB-INF/login.jsp";
            }
        }else{
            //非法用户
            model.addAttribute("result","用户名或密码错误");
            return "/WEB-INF/login.jsp";
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "/WEB-INF/login.jsp";
    }

    /**
     * 仓库管理员处理函数
     * @return
     */
    @RequestMapping("/wareMnger")
    public String wareMnger(){
        System.out.println("wareMnger,success");
        return "/WEB-INF/index.jsp";
    }


    /**
     * 采购管理员处理函数
     * @return
     */
    @RequestMapping("/buyerMnger")
    public String buyerMnger(Model model){
        System.out.println("buyerMnger,success");
        //获取所有订单
//        List<MyOrder> orderList=orderService.getOrderList();
//        model.addAttribute("orderList",orderList);
        //System.out.println(orderList);
        return "/WEB-INF/index.jsp";
    }

    /**
     * 超级管理员处理函数
     * @return
     */
    @RequestMapping("/superMnger")
    public String superMnger(){
        System.out.println("superMnger,success");
        return "pass";
    }
}
