package com.exam.controller;

import com.exam.dto.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Controller
@SessionAttributes(value = {"session2","xxx"}) //session에 저장할 값을 지정해준다
public class MainController5 {


    //5. 유틸리티
    @GetMapping("/m5")
    public String  m(Model model) {

        //날짜 데이터저장
        System.out.println(LocalDate.now());
        model.addAttribute("today", LocalDate.now());

        //문자열 유틸리티
        model.addAttribute("username", "HongKilDong");

        //숫자 유틸리티
        model.addAttribute("price", 987654321);
        //리스트, 셋, 맵 유틸리티
        model.addAttribute("myList", Arrays.asList("A","B","C"));

        return "main5";


    }
}
