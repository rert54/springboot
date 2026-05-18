package com.exam.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TestController {

    //1.리턴타입이 String = 뷰
    @GetMapping("/test")
    public String main() {
        System.out.println("main");

        //예외발생
        if (true) throw new ArithmeticException("ArithmeticException 예외발생");

        return "main";
    }
}
