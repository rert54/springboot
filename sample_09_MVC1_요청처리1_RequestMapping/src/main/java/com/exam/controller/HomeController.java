package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    //http://localhost:8080/hello
    // 컨테스트 x 서블릿도 /로 요청했음


    @RequestMapping("/hello")
    public String hello(){
        // Model과 View처리
        //타입립을 알려주는 리턴타입을 통해서 알려준다. 여기선 main글자열이라서 String
        //String이라면 View이다
        System.out.println("hello");
        return "main";
    }

    //http://localhost:8080/hello2
    //http://localhost:8080/hello3
    @RequestMapping(value = {"/hello2","/hello3"})
    public String hello2(){
        // Model과 View처리
        //타입립을 알려주는 리턴타입을 통해서 알려준다. 여기선 main글자열이라서 String
        //String이라면 View이다
        System.out.println("hello2 및 hello3");
        return "main";
    }

    //http://localhost:8080/yyy아무거나
    @RequestMapping(value ="/yyy*")
    public String yyy(){
        // Model과 View처리
        //타입립을 알려주는 리턴타입을 통해서 알려준다. 여기선 main글자열이라서 String
        //String이라면 View이다
        System.out.println("yyy");
        return "main";
    }

    //http://localhost:8080/zzz/아무거나 하나만 된다 zzz/*/는 안됨
    @RequestMapping(value ="/zzz/*")
    public String zzz(){
        // Model과 View처리
        //타입립을 알려주는 리턴타입을 통해서 알려준다. 여기선 main글자열이라서 String
        //String이라면 View이다
        System.out.println("zzz");
        return "main";
    }

    //http://localhost:8080/xyz/아무거나/아무거나/..  아무거나이기에 안와도 된다
    @RequestMapping(value ="/xyz/**")
    public String xyz(){
        // Model과 View처리
        //타입립을 알려주는 리턴타입을 통해서 알려준다. 여기선 main글자열이라서 String
        //String이라면 View이다
        System.out.println("xyz");
        return "main";
    }

    //http://localhost:8080/aaa/*/bbb 중간에 특정결로 하나
    @RequestMapping(value ="/aaa/*/aaa")
    public String aaa_bbb(){
        // Model과 View처리
        //타입립을 알려주는 리턴타입을 통해서 알려준다. 여기선 main글자열이라서 String
        //String이라면 View이다
        System.out.println("aaa_bbb");
        return "main";
    }

    //http://localhost:8080/aaa/아무거나/bbb
    /*
    반드시 다음과 같이 설정해야됨
     */
    @RequestMapping(value ="/ccc/**/ddd")
    public String ccc_ddd(){
        // Model과 View처리
        //타입립을 알려주는 리턴타입을 통해서 알려준다. 여기선 main글자열이라서 String
        //String이라면 View이다
        System.out.println("ccc_ddd");
        return "main";
    }


}
