package com.exam.controller;


import com.exam.dto.LoginDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Map;


@Controller
public class MainController {

    //1.String타입
    //뷰정보만 있고 모델정보는 없음
    @GetMapping("/m")
    public String  main(){


        return "main";
    }

    //2.ModelANDView
    //뷰정보 있고 모델정보 있음
    @GetMapping("/m2")
    public ModelAndView main2(){

        ModelAndView mav = new ModelAndView();
        mav.setViewName("main2"); //view 설정
        mav.addObject("userid","inky");

        return mav;
    }

    //3. String 타입
    //모델정보(LoginDTO) 있고 뷰정보가 없음
    //따라서 우리가 뷰정보를 유추해야함. 요청 매핑값으로 뷰 정보를 유추한다
    @GetMapping("/m3")
    public @ModelAttribute("xxx") LoginDTO main3(){

        LoginDTO dto = new LoginDTO("inky","1234");
        return dto;
    }

    //4.
    @GetMapping("/m4")
    public @ModelAttribute("yyy") ArrayList<String> main4(){

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("inky");
        nameList.add("inky1");
        nameList.add("inky2");
        return nameList;
    }

    //5. void타입
    //뷰정보는 없고 모델정보는 없음
    //따라서 뷰정보는 우리가 유추해야됨. 욫어 매핑갑승로 뷰 정보를 유추함 m5.html
    @GetMapping("/m5")
    public void main5(){



    }

}
