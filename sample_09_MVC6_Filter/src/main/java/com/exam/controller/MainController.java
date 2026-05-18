package com.exam.controller;


import com.exam.dto.LoginDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class MainController {

    //1.리턴타입이 String = 뷰
    @GetMapping("/main")
    public String main(){
        System.out.println("main");
        return "main";
    }

    @GetMapping("/main2")
    public String main2(){
        System.out.println("main2");
        return "main";
    }

}
