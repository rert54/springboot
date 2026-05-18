package com.exam.controller;


import com.exam.dto.LoginDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Map;


@Controller
public class MainController {

    @GetMapping("/m")
    public String  main(HttpServletRequest request){

        request.setAttribute("userid","inky4832");
        request.setAttribute("email","inky4832@exam.com");

        return "main";
    }
    @GetMapping("/m2")
    public String  main2(Model model){

        model.addAttribute("userid","inky4832");
        model.addAttribute("email","inky4832@exam.com");

        return "main2";
    }
    @GetMapping("/m3")
    public String  main3(Map<String,String> map){

        map.put("userid","inky4832");
        map.put("email","inky4832@exam.com");

        return "main3";
    }
    // DTO가 모델
    @GetMapping("/m10")
    public String  main10(HttpServletRequest request){

        //DB연동해서 가져온 LoginDTO 데이터 (모델)
        LoginDTO dto = new LoginDTO("inky4832","1234");
        request.setAttribute("dto",dto);

        return "main4";
    }
    @GetMapping("/m4")
    public String  main4( @ModelAttribute("xxx") LoginDTO dto){ // 모델이 됨. 즉 html에서 보여줄 수 있음.
                                        // 자동으로 ("loginDTO", dto)
                                        // 명시적으로 key 지정 가능. @ModelAttribute("key")
                                        // 이제는 ("key", dto);

        dto.setUserid("inky4832");
        dto.setPassword("1234");

        return "main4";
    }

}
