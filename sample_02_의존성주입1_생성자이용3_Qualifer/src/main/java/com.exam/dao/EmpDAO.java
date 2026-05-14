package com.exam.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
//@Primary
@Repository("empRepository")
public class EmpDAO implements CommonDAO {
    public EmpDAO() {
        System.out.println("EmpDAO");
    }

    //DB연동 가정
    @Override
    public List<String> findAll(){
        return Arrays.asList("hong","lee");
    }
}
