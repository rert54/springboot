package com.exam.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class FilterWebConfig implements WebMvcConfigurer {

    @Bean
    public FilterRegistrationBean<MyFilter> filterRegistrationBean(){

        FilterRegistrationBean<MyFilter> filterRegistrationBean = new FilterRegistrationBean<MyFilter>();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.addUrlPatterns("/*"); //"/main", /main2
        return filterRegistrationBean;
    }

}
