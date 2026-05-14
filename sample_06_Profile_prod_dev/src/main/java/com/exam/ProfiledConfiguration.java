package com.exam;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProfiledConfiguration{

    @Bean
    public String createProd(){
        System.out.println("create prod");
        return "dev관련 객체 생성"; // Emp 사용
    }

    @Bean
    public String createDev(){
        System.out.println("createDev");
        return "dev관련 객체 생성"; // Dept 사용
    }
}

