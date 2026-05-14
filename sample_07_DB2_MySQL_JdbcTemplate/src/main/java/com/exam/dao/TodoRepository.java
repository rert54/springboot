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
    public List<TodoDTO> findAll3(){

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

         List<TodoDTO> list = jdbcTemplate.query(sql, mapper);

        return list;
    }//end findAll

    //목록보기2
    public List<TodoDTO> findAll2(){

//         jdbcTemplate.query(sql, RowMapper<T>)
        String sql = "select id, name, job from todo";

        List<TodoDTO> list = jdbcTemplate.query(sql, new RowMapper<TodoDTO>() {
            @Override
            public TodoDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
                TodoDTO  todoDTO = new TodoDTO();
                todoDTO.setId(rs.getInt("id"));
                todoDTO.setName(rs.getString("name"));
                todoDTO.setJob(rs.getString("job"));
                return   todoDTO ;
            }
        });

        return list;
    }//end findAll
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

        //람다표현식
        RowMapper<TodoDTO> mapper2 = ( rs,  rowNum) ->{
            TodoDTO  todoDTO = new TodoDTO();
            todoDTO.setId(rs.getInt("id"));
            todoDTO.setName(rs.getString("name"));
            todoDTO.setJob(rs.getString("job"));
            return   todoDTO ;
        };


                List<TodoDTO> list = jdbcTemplate.query(sql, ( rs,  rowNum) ->{
                    TodoDTO  todoDTO = new TodoDTO();
                    todoDTO.setId(rs.getInt("id"));
                    todoDTO.setName(rs.getString("name"));
                    todoDTO.setJob(rs.getString("job"));
                    return   todoDTO ;
                });

        return list;
    }//end findAll

    //id로 찾기
    public TodoDTO findById(int id){

//        jdbcTemplate.queryForObject(sql, RowMapper<T>, Object ...)
        String sql = "select id, name, job from todo where id = ?";
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
        TodoDTO dto=jdbcTemplate.queryForObject(sql, mapper, id);
        return dto;
    }//end findById

// insert 작성
    public int save(TodoDTO todoDTO){

//        jdbcTemplate.update(sql, Object ...)

        String sql = "insert into todo (id, name, job) values (?, ?, ?)";
        int n = jdbcTemplate.update(sql, todoDTO.getId(), todoDTO.getName(), todoDTO.getJob());
        return n;
    }//end save

//update
    public int update(TodoDTO todoDTO){
        String sql="update todo set name=?,job=? where id=?";
        int n =  jdbcTemplate.update(sql, todoDTO.getName(), todoDTO.getJob(), todoDTO.getId());
        return n;
    }
//delete
    public int  delete(int id){
        String sql="delete from todo where id=?";
        int n =  jdbcTemplate.update(sql, id);
        return n;
    }


}//end class
