package com.exam.dao;

import com.exam.dto.TodoDTO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TodoRepository {

    @Repository
    public class TodoRepository {
        JdbcTemplate jdbcTemplate;
        public TodoRepository(JdbcTemplate jdbcTemplate) {
            this.jdbcTemplate = jdbcTemplate;
        }
        //목록보기
        public List<TodoDTO> findAll() {

                //jdbcTemplate.query(sql, RowMapper<T>)
                String sql = "select id, name, job from todo";
                //RowMapper 인터페이스 생성 - 익명클래스 문법: 인터페이스 익명명 = 인터페이스명
            RowMapper<TodoDTO> mapper = new RowMapper<TodoDTO>() {
                @Override
                public TodoDTO mapRow(ResultSet rs, int rowNum) throws SQLException {

                    TodoDTO todoDTO = new TodoDTO();
                    todoDTO.setId(rs.getInt("id"));
                    todoDTO.setName(rs.getString("name"));
                    todoDTO.setJob(rs.getString("job"));
                    return todoDTO;
                }
            };

            List<TodoDTO> list = jdbcTemplate.query(sql, mapper);


            return list;
        }//end findAll

        //목록보기
        public List<TodoDTO> findAll2() {

            //jdbcTemplate.query(sql, RowMapper<T>)
            String sql = "select id, name, job from todo";
            //RowMapper 인터페이스 생성 - 익명클래스 문법: 인터페이스 익명명 = 인터페이스명
            RowMapper<TodoDTO> mapper = new RowMapper<TodoDTO>() {
                @Override
                public TodoDTO mapRow(ResultSet rs, int rowNum) throws SQLException {

                    TodoDTO todoDTO = new TodoDTO();
                    todoDTO.setId(rs.getInt("id"));
                    todoDTO.setName(rs.getString("name"));
                    todoDTO.setJob(rs.getString("job"));
                    return todoDTO;
                }
            };

            List<TodoDTO> list = jdbcTemplate.query(sql, mapper);


            return list;
        }//end findAll2

        //목록보기3
        public List<TodoDTO> findAll3() {

            //jdbcTemplate.query(sql, RowMapper<T>)
            String sql = "select id, name, job from todo";
            //RowMapper 인터페이스 생성 - 익명클래스 문법: 인터페이스 익명명 = 인터페이스명
            RowMapper<TodoDTO> mapper = new RowMapper<TodoDTO>() {
                @Override
                public TodoDTO mapRow(ResultSet rs, int rowNum) throws SQLException {

                    TodoDTO todoDTO = new TodoDTO();
                    todoDTO.setId(rs.getInt("id"));
                    todoDTO.setName(rs.getString("name"));
                    todoDTO.setJob(rs.getString("job"));
                    return todoDTO;
                }
            };

            //람다표현식
            RowMapper<TodoDTO> mapper2 = (ResultSet rs, int rowNum) -> {
                TodoDTO todoDTO = new TodoDTO();
                todoDTO.setId(rs.getInt("id"));
                todoDTO.setName(rs.getString("name"));
                todoDTO.setJob(rs.getString("job"));
                return todoDTO;
            };

            //Mapper 대신 람다 넣음
            List<TodoDTO> list = jdbcTemplate.query(sql, (ResultSet rs, int rowNum) -> {
                TodoDTO todoDTO = new TodoDTO();
                todoDTO.setId(rs.getInt("id"));
                todoDTO.setName(rs.getString("name"));
                todoDTO.setJob(rs.getString("job"));
                return todoDTO;
            });


            return list;
        }//end findAll3
    }


}
