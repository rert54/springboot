package com.exam.service;

import com.exam.dao.DeptDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service("service")
public class DeptServieImpl {

    @Autowired
    DeptDAO dao;

    public List<String> findAll(){
        return dao.findAll();
    }

}
