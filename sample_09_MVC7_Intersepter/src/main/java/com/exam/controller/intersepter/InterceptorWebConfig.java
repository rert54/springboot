package com.exam.controller.intersepter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class InterceptorWebConfig implements WebMvcConfigurer {

    //Interceiptor를 등록하는 메서드가 제공됨
    //Generate - overide method - addInterceptors
    @Autowired
    myintersepter myInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // @component할시

        registry.addInterceptor(myInterceptor).addPathPatterns("/main","/aaa/*","/bbb*");
        //aaa bbb 예시로 넣어둠

        //registry.addInterceptor(new myintersepter()); myintersepter에서 @component 안할시
    }
}
