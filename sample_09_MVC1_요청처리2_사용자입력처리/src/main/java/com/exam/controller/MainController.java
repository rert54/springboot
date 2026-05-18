package com.exam.controller;

import com.exam.dto.LoginDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {

    @GetMapping("/loginForm")
    public String  loginForm(){
        return "loginForm";
    }

    @GetMapping("/login2")
    public String hello2(HttpServletRequest request, HttpServletResponse response) {

        String userid = request.getParameter("userid");
        String password = request.getParameter("password");

        System.out.println(userid+":"+password);
        return "main";
    }

    @GetMapping("/login3")
    public String hello3(@RequestParam(name = "userid") String userid,
                        @RequestParam(value = "password") //value는 name의 별칭
                        String password) {
        System.out.println(userid+":"+password);
        return "main";
    }

    //파라미터와 변수명이 동일하면 파라미터명 생략이 가능하다
    @GetMapping("/login4")
    public String hello4(@RequestParam String userid,
                        @RequestParam
                        String password) {
        System.out.println(userid+":"+password);
        return "main";
    }

    //@RequestParam은 필수임. 따라서 반드시 해당 이름으로 넘겨줘야만 한다
    //해당이름으로 전달하지 않으면 400 에러가 발생한다
    //필수 속성을 비활성화 가능
    //비활성화시 null값으로 설정됨. required = false
    //null값 대신에 기본값으로 성정 가능
    @GetMapping("/login5")
    public String hello5(@RequestParam(name = "userid") String userid,
                         @RequestParam(value = "password",required = false, defaultValue = "9999")
                         String password) {
        System.out.println(userid+":"+password);
        return "main";
    }

    //사용자 입력 파라미터값이 자동으로 DTO에 저장가능.
    @GetMapping("/login6")
    public String hello6(LoginDTO dto) {

        System.out.println(dto);
        return "main";
    }

    //사용자 입력 파라미터값이 Map<String, String> 로 저장가능
    @GetMapping("/login7")
    public String hello7(@RequestParam Map<String, String> map) {

        System.out.println(map);
        return "main";
    }

    @PostMapping("/login")
    public String hello(@RequestParam(name = "userid") String userid,
                         @RequestParam(value = "password") //value는 name의 별칭
                         String password) {
        System.out.println(userid+":"+password);
        return "main";
    }
}
