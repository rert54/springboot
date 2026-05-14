package com.exam;

import com.exam.dto.TodoDTO;
import com.exam.service.TodoService;
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
    TodoService todoService;

    @Override
    public void run(String... args) throws Exception {

        TodoDTO todoDTO = new TodoDTO(4,"이순신","learn Docker");
        int n = todoService.save(todoDTO);
        System.out.println("-------------------------");
        todoDTO = new TodoDTO(4,"이순신2","learn Docker, k8s");
        int n2 = todoService.update(todoDTO);
        System.out.println("-------------------------");
        int n3 = todoService.delete(3);
        System.out.println("-------------------------");
        List<TodoDTO> list = todoService.findAll();;
        System.out.println(list);
        System.out.println("-------------------------");
        TodoDTO dto = todoService.findById(1);
        System.out.println(dto);
    }
}
