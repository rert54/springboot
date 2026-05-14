package com.exam.dao;

import org.springframework.stereotype.Repository;

@Repository("repository")
public class DeptDAO {

    public DeptDAO() {
        System.out.println("DeptDAO");
    }
}
