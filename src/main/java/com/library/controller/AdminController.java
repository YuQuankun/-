package com.library.controller;
import com.library.bean.Admin;
import com.library.bean.Book;
import com.library.bean.Lend;
import com.library.bean.ReaderCard;
import com.library.service.AdminService;
import com.library.service.BookService;
import com.library.service.LendService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.maven.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("/admin_regsiter.html")
    public ModelAndView adminregister(){
        return  new ModelAndView("admin_regsiter");
    }
    @RequestMapping("/registerAdmin.html")
    public String addAdminDo( Admin admin,RedirectAttributes redirectAttributes){
        if(adminService.InsertAdmin(admin)){
            redirectAttributes.addFlashAttribute("succ","管理员添加成功");
        }
        else {
            redirectAttributes.addFlashAttribute("succ","管理员添加失败");
        }
        return "redirect:/index.html";
    }
    @RequestMapping("/index.html")
    public ModelAndView index(){
        return new ModelAndView("index");
    }
    @RequestMapping("/admin_info.html")
    public ModelAndView Admin_Info(){
        ModelAndView modelAndView =new ModelAndView("admin_info");
        return modelAndView;
    }
}
