package com.exam.service;

import com.exam.dao.DeptDAO;
import com.exam.dao.EmpDAO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("service")
public class DeptServieImpl {

    DeptDAO dao;
    EmpDAO empdao;
    // 생성자 주입
    public DeptServieImpl(DeptDAO dao,EmpDAO empdao) {
        System.out.println("DeptServieImpl");
        this.dao = dao;
        this.empdao = empdao;

    }
    public List<String> findAll(){

        List<String> list = dao.findAll();
        List<String> empList = empdao.findAll();
        list.addAll(empList);
        return list;
    }

}
