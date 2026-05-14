package com.exam;

import com.exam.dto.TodoDTO;
import com.exam.service.TodoMyBatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("Hello World 안녕하세요");
    }

    @Autowired
    TodoMyBatisService todoMyBatisService;

    @Override
    public void run(String... args) throws Exception {

        TodoDTO dto = new TodoDTO(11,"홍길동","Learn Spring");
        int n = todoMyBatisService.save(dto);
        System.out.println("-------------------------------------");
        dto = new TodoDTO(11,"홍길동2","Learn Spring Boot");
        int n2 = todoMyBatisService.updateById(dto);;

        System.out.println("-------------------------------------");
        int n3 =  todoMyBatisService.deleteById(2);
        System.out.println("-------------------------------------");
        List<TodoDTO> list = todoMyBatisService.findAll();
        System.out.println(list);
        System.out.println("-------------------------------------");
        TodoDTO todoDTO = todoMyBatisService.findById(1);
        System.out.println(todoDTO);

    }
}
