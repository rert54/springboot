package com.exam.controller;

import com.exam.dto.LoginDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    @GetMapping("/loginForm")
    public String  loginForm(){
        return "loginForm";
    }

    @GetMapping("/login2")
    public String  login2(@RequestParam("userid") String userid,
                         @RequestParam("password") String password,
                         @RequestParam("email") String [] email
                         ){

       System.out.println(userid);
       System.out.println(password);
       System.out.println(Arrays.toString(email));

        return "loginForm";
    }

    @GetMapping("/login3")
    public String  login3(@RequestParam("userid") String userid,
                         @RequestParam("password") String password,
                         @RequestParam("email") List<String> email
    ){

        System.out.println(userid);
        System.out.println(password);
        System.out.println(email);

        return "loginForm";
    }
    @GetMapping("/login")
    public String  login(LoginDTO loginDTO){

        System.out.println(loginDTO.getUserid());
        System.out.println(loginDTO.getPassword());
        System.out.println(loginDTO.getEmail());

        return "loginForm";
    }
}
