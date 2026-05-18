package com.exam.controller;


import com.exam.dto.LoginDTO;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Map;


@Controller
//세션에 저장하고자하는 key설정
@SessionAttributes(names = {"bbb","ccc"}) //세선에 저장할 name을 넣는다
public class MainController2 {

    //application scope 저장
    @Autowired
    ServletContext x;{ //apllication

}
    @GetMapping("/k")
    public String  main(Model model){

        //request scope에 저장
        model.addAttribute("aaa","hong1");

        //session scope에 저장
        model.addAttribute("bbb","hong2");
        model.addAttribute("ccc","hong3");

        //application scop에 저장
        x.setAttribute("ddd","hong4");


        return "target"; // target.html
    }

    @GetMapping("/k2")
    public String  main2(){


        return "target"; // target.html
    }




}
