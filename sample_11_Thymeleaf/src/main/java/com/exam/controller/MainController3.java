package com.exam.controller;

import com.exam.dto.LoginDTO;
import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes(value = {"session2","xxx"}) //session에 저장할 값을 지정해준다
public class MainController2 {


    //2. scope에 객체를 저장하고 html에 보여주기
    @GetMapping("/m")
    public String  m(Model model){

        model.addAttribute("login",new LoginDTO("inky4832","1234");



        return "main2";
    }


}
