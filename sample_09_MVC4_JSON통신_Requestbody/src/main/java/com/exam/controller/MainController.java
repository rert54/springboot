package com.exam.controller;


import com.exam.dto.LoginDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class MainController {

    //1.리턴 타입이 String
    @GetMapping("/aaa")
    @ResponseBody
    public String aaa(){
        return "Hello World";
    }

    @GetMapping("/bbb")
    @ResponseBody
    public LoginDTO bbb(){ //LoginDTO를 JSON포맷으로 바꿔줌
        LoginDTO dto = new LoginDTO("inky","1234");
        return dto;
    }

    @GetMapping("/ccc")
    @ResponseBody //Json포맷으로 반환하고 싶을때 사용하는 어노테이션
    public ArrayList<LoginDTO>  ccc(){

        ArrayList<LoginDTO> list = new ArrayList<>();
        list.add(new LoginDTO("inky","1234"));
        list.add(new LoginDTO("inky2","1234"));

        return list;
    }

    @GetMapping("/ddd")
    @ResponseBody //Json포맷으로 반환하고 싶을때 사용하는 어노테이션
    public HashMap<String ,ArrayList<LoginDTO>> ddd(){


        ArrayList<LoginDTO> list = new ArrayList<>();
        list.add(new LoginDTO("inky","1234"));
        list.add(new LoginDTO("inky2","1234"));

        HashMap<String ,ArrayList<LoginDTO>> map = new HashMap<>();
        map.put("one",list);

        return map;
    }

    //1. 리턴타입이 String
    @GetMapping(value = "/eee", produces = "text/xml")
    @ResponseBody // 리턴되는 값 자체로 응답처리됨
    public String  eee(){
        return "<Person><name>hong</name><age>20</age></Person>";
    }

    //1. 리턴타입이 String
    @GetMapping(value = "/fff", produces = "text/xml")
    @ResponseBody // 리턴되는 값 자체로 응답처리됨
    public String  fff(){
        return "<html><body><h1>Hello</h1></body></html>";
    }

    /*
    POST : Http://localhost:8080/ggg
        {
           "userid":"xxx",
           "password":"1234"
         }
        dto가 받는다




     */
    @PostMapping("/ggg")
    @ResponseBody // 리턴되는 값 자체로 응답처리됨
    public String  ggg( @RequestBody LoginDTO dto){
        System.out.println(dto);
        return "Hello World";
    }

    /*
    POST : Http://localhost:8080/hhh  배열도 가능하다
        [
        {
        "userid":"xxx"
        "password":"1234"
        },
        {
        "userid":"xxx"
        "password":"1234"
        }
        ]

        arraylist or list가 받는다
     */
    @PostMapping("/hhh")
    @ResponseBody // 리턴되는 값 자체로 응답처리됨
    public String  hhh(@RequestBody List<LoginDTO> dto){
        System.out.println(dto);
        return "Hello World";
    }


}
