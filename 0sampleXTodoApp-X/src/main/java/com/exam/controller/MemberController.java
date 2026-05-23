package com.exam.controller;

import com.exam.dto.MemberDTO;
import com.exam.service.MemberService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    MemberService memberService;
    public MemberController(MemberService memberService) {

    }

    @GetMapping("/signup")
    public String signForm(Model model) {

        model.addAttribute("xxx", new MemberDTO());
        return "memberForm";
    }

    @PostMapping("/signup")
    public String signup(@Valid @ModelAttribute("xxx") MemberDTO memberDTO, BindingResult bindingResult) {

        //검증실패
        if(bindingResult.hasErrors()) {
            return "memberForm";
        }
        //서비스 연동
        //추가로 예외처리 하기(로컬 또는 전역)
        int n = memberService.signup(memberDTO);

        //검증성공
        return "redirect:home";
    }
}
