package com.exam;

import com.exam.service.DeptServieImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    // IoC Container 주입
    @Autowired
    ApplicationContext acx;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World");

        DeptServieImpl service = acx.getBean("service", DeptServieImpl.class);
        List<String> list = service.findAll();
        System.out.println(list);
    }
}
