package com.exam.controller;

import com.exam.dto.MemberDTO;
import com.exam.service.AuthenticationService;
import com.exam.service.MemberService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Map;

@Controller
@SessionAttributes(value = {"my_login"})
public class LoginController {

    AuthenticationService  authenticationService;
    public LoginController(AuthenticationService authenticationService){
        this.authenticationService = authenticationService;
    }

    @GetMapping("/login")
    public String  loginForm(){

        return "loginForm";
    }
    @PostMapping("/login")
    public String  login(@RequestParam Map<String,String> map,
                         Model model,
                         RedirectAttributes redirectAttributes){

        if(authenticationService.authenticate(map) != null){ // 인증완료 ( userid와 password가 일치된 경우)
            //세션에 임의의 데이터 저장 ex. MemberDTO, userid .....
            //저장된 세션을 이용해서 로그인여부 확인(*********************)
            model.addAttribute("my_login", map.get("userid"));
            return "redirect:home";
//            return "home";
        }

        // 인증 불가 ( userid 또는 password가 일치 안된 경우)
        redirectAttributes.addFlashAttribute("errorMessage", "userid 또는 password 를 다시 입력해주세요");
        return "redirect:login";  //PRG 패턴
    }

    /*
       @SessionAttributes(value = {"my_login"})
       위처럼 사용된 세션 정보 삭제하는 방법.

       SessionStatus 의 setComplete() 메서드이용
     */
    @GetMapping("/logout")
    public String  logout(SessionStatus sessionStatus){

        sessionStatus.setComplete(); // 세션 삭제

        return "redirect:/home";
    }

}
