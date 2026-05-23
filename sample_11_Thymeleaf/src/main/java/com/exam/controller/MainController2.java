package com.exam.controller;

import com.exam.dto.LoginDTO;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Map;

@Controller
@SessionAttributes(value = {"session2","xxx"}) //session에 저장할 값을 지정해준다
public class MainController {

    @Autowired
    ServletContext servletContext

    //1. scope에 저장하고 html에 보여주기
    @GetMapping("/m")
    public String  m(Model model){

        model.addAttribute("request","홍길동");

        model.addAttribute("session2","홍길동2");
        model.addAttribute("xxx","홍길동3");

        servletContext.setAttribute("application","홀길동4");

        return "main";
    }


}
