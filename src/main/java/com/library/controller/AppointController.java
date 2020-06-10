package com.library.controller;

import com.library.bean.Admin;
import com.library.bean.Book;
import com.library.bean.Lend;
import com.library.bean.ReaderCard;
import com.library.bean.Appoint;
import com.library.service.AdminService;
import com.library.service.BookService;
import com.library.service.LendService;
import com.library.service.AppointService;
import com.sun.org.apache.xpath.internal.operations.Mod;
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
public class AppointController {
    @Autowired
    private AppointService appointService;
    @Autowired
    private LendService lendService;

    private Date getDate(String pubstr) {
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            return df.parse(pubstr);
        } catch (ParseException e) {
            e.printStackTrace();
            return new Date();
        }
    }
    @RequestMapping("/appointbook.html")
    public String bookAppoint(HttpServletRequest request,RedirectAttributes redirectAttributes){
        long bookId = Long.parseLong(request.getParameter("bookId"));
        long readerId = ((ReaderCard) request.getSession().getAttribute("readercard")).getReaderId();
        System.out.println(bookId);
        System.out.println(readerId);
        Appoint appoint = new Appoint();
        appoint.setBookId(bookId);
        appoint.setReaderId(readerId);
        if(appointService.Appointbook(appoint)){
            redirectAttributes.addFlashAttribute("succ","图书预约成功");
        }
        else{
            redirectAttributes.addFlashAttribute("error","图书预约失败");
        }
        return "redirect:/reader_book.html";
    }
    @RequestMapping("/admin_appoint.html")
    public ModelAndView Admin_Appoint(){
        ModelAndView modelAndView=new ModelAndView("admin_appoint");
        modelAndView.addObject("list",lendService.lendList());
        return modelAndView;
    }
}
