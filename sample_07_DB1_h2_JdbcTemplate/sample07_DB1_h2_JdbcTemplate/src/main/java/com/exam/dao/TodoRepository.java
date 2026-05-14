package com.exam.dao;

import com.exam.dto.TodoDTO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class TodoRepository {

    JdbcTemplate jdbcTemplate;
    public TodoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //목록보기
    public List<TodoDTO> findAll(){

//         jdbcTemplate.query(sql, RowMapper<T>)
           String sql = "select id, name, job from todo";
            //RowMapper 인터페이스 생성 - 익명클래스
          RowMapper<TodoDTO> mapper = new RowMapper<TodoDTO>() {
              @Override
              public TodoDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
                  TodoDTO  todoDTO = new TodoDTO();
                  todoDTO.setId(rs.getInt("id"));
                  todoDTO.setName(rs.getString("name"));
                  todoDTO.setJob(rs.getString("job"));
                  return   todoDTO ;
              }
          };



        return null;
    }//end findAll

}//end class
