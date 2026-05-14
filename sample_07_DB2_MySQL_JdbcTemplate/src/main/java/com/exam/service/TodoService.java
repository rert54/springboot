package com.exam.service;

import com.exam.dto.TodoDTO;

import java.util.List;

public interface TodoService {

     List<TodoDTO> findAll(); // public abstract 자동 설정
     TodoDTO findById(int id);
     int save(TodoDTO todoDTO);
    int update(TodoDTO todoDTO);
    int  delete(int id);
}
