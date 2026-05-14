package com.exam.dao;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository("deptRepository")
public class DeptDAO implements CommonDAO {
    public DeptDAO() {
        System.out.println("DeptDAO");
    }

    //DB연동 가정
    @Override
    public List<String> findAll(){
        return Arrays.asList("홍길동","이순신");
    }
}
