package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {

    //화면 보여주는 요청
    //http://localhost:8080/memberForm
    @RequestMapping(value = "/memberForm")
    public String hello(){
        System.out.println("memberForm");
        return "memberForm";
    }

    //1. GET 요청 처리하는 코드
    //@RequestMapping(value = "/memberGET") // GET 방식으로 요청됨. G
    //@RequestMapping(value = "/member", method = RequestMethod.GET)
    @GetMapping("/member")
    public String memberGet(){
        System.out.println("memberGET");
        return "memberForm";
    }

    //2. POST 요청 처리하는 코드
    //@RequestMapping(value = "/memberGET") // GET 방식으로 요청됨.
    // GET으로 화면보고 작동시 POST로 처리
    //실작업은 대부분 이렇게 사용함 메소드로 구분하는 방법
    //@RequestMapping(value = "/member", method = RequestMethod.POST)
    @PostMapping("/member")
    public String memberPost(){
        System.out.println("memberPost");
        return "memberForm";
    }
}
