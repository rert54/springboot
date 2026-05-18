package com.exam.controller;


import com.exam.dto.LoginDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class MainController {

    //1.리턴타입이 String = 뷰
    @GetMapping("/main")
    public String aaa(){
        System.out.println("main");
        return "main";
    }

    //1.리턴타입이 String = 뷰
    @GetMapping("/forward")
    public String forward(Model model){
        System.out.println("forward");
        model.addAttribute("userid","inky");
        return "forward:main"; //포워드가 main으로 돌려서 호출한다 따라서 출력은 main이지만 url은 forward

    }

    @GetMapping("/redirect")
    public String redirect(Model model){
        System.out.println("redirect");
        model.addAttribute("userid","inky");
        return "forward:main"; //포워드가 main으로 돌려서 호출한다 따라서 출력은 main이지만 url은 forward

    }

    //flash scope
    @GetMapping("/flash")
    public String flash(RedirectAttributes model){
        System.out.println("flash");
        model.addFlashAttribute("userid","inky");

        return "forward:main"; //포워드가 main으로 돌려서 호출한다 따라서 출력은 main이지만 url은 forward

    }
}
