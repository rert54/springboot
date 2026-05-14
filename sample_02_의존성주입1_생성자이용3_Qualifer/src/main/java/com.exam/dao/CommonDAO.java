package com.exam.dao;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;


public interface CommonDAO {

    //DB연동 가정
        public  abstract List<String> findAll();
}
