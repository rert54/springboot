package com.exam.controller;

import com.exam.dto.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@SessionAttributes(value = {"session2","xxx"}) //session에 저장할 값을 지정해준다
public class MainController3 {


    //3. scop에 객체를 저장하고, html에 보여주기 (제어문 처리: if, switch, 3항연산자, 반복문)
    @GetMapping("/m3")
    public String  m(Model model){

        model.addAttribute("login",new LoginDTO("inky4832","1234"));
        model.addAttribute("login2",new LoginDTO("null","1234"));

        //asList는 크기가 정해진 list라 수정이 불가능하다
        List<LoginDTO> list = Arrays.asList(new LoginDTO("inky4832","1234"),
            new LoginDTO("null","1234"),
            new LoginDTO("inky4832","1234")
            );
        model.addAttribute("myList",list); //모델에 저장

        return "main3";
    }


}
