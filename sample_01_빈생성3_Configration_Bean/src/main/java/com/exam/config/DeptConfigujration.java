package com.exam.config;

//DeptController, DeptServiceImpl,DeptDAO를 명시적으로 생성

import com.exam.controller.DeptController;
import com.exam.dao.DeptDAO;
import com.exam.service.DeptServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.BeanProperty;

@Configuration
public class DeptConfigujration {

    @Bean
    public DeptController createDeptController(){
        return new DeptController();
    }
    @Bean
    public DeptServiceImp createDeptserviceImpl(){
        return new DeptServiceImp();
    }
    @Bean
    public DeptDAO createDeptDAO(){
        return new DeptDAO();
    }
}
