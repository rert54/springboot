package com.exam.service;

import com.exam.dao.CommonDAO;
import com.exam.dao.DeptDAO;
import com.exam.dao.EmpDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service("service")
public class DeptServieImpl {

    CommonDAO dao;

@Autowired
DeptDAO dao;

@Autowired
EmpDAO empdao;

    public List<String> findAll(){
        return dao.findAll();
    }

}
