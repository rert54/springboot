package com.exam.controller;


import jakarta.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Enumeration;
import java.util.Map;

@Controller
public class MainController {

    @GetMapping("/main")
    public String  main(HttpServletRequest request){

        Enumeration<String> enu = request.getHeaderNames();
        while(enu.hasMoreElements()){
            String key = enu.nextElement();
            String value = request.getHeader(key);
            System.out.println(key+":"+value);


        }

        return "main";
    }

    @GetMapping("/main2")
    public String  main2(@RequestHeader(name = "user-agent") String userAgent,
                        (@RequestHeader(name = "connecriton") String connection
    ){
        System.out.println("userAgent: " + userAgent);
        System.out.println("connection: " + connection);
        return "main";

    }
}
