package com.exam.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpDAO {
    public EmpDAO(){System.out.println("EmpDAO");}

    public List<String> findAll(){
        //return Arrays.asList("hong","Lee"); //asList로 만든리스트는 수정불가
        return new ArrayList<>(Arrays.asList("Hong","Lee")); //수정가능
    }
}
