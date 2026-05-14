package com.exam.service;

import com.exam.dao.DeptDAO;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service("service")
public class DeptServieImpl {

    DeptDAO dao;

    // 생성자 주입
    public DeptServieImpl(DeptDAO dao) {
        System.out.println("DeptServieImpl");
        this.dao = dao;
    }
    public List<String> findAll(){
        return dao.findAll();
    }

}
