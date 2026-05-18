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

        //예외발생
        if(true) throw new IllegalArgumentException("IllegalArgumentException 예외발생");

        return "main";
    }

    @GetMapping("/main2")
    public String main2(){
        System.out.println("main2");

        /예외발생
        if(true) throw new NullPointerException("IllegalArgumentException 예외발생");

        return "main";
    }


    //로컬
    //특정 controller에서 처리
    //2가지 기능 : View+Model
    //@ExceptionHandler <- 모든 에러를 잡는다
    //(value = 에러종류.class)를 추가하여 원하는 에러만 잡을수 있다. ,로 여러 에러 종류를 추가할 수 있다 중괄호로 묵어야한다
    @ExceptionHandler(value = {IllegalArgumentException.class, NullPointerException.class})

    //public ModelAndView handleException(Exception ex, RedirectAttributes redirectAttributes){
        public String handleException(Exception ex, Model model){

        model.addAttribute("message",ex.getMessage());
            return "error/error";  //error/error.html
    }
}
