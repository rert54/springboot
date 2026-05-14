package com.exam.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class HomeController2 {

    //http://localhost:8080/member/list
    @RequestMapping(value = "/list")
    public String hello(){
        System.out.println("member.list");
        return "main";
    }

    //http://localhost:8080/member/list
    @RequestMapping(value = "/write")
    public String write(){
        System.out.println("member.write");
        return "main";
    }


}
