package com.example.demo.atguigu.boot.config;

import com.example.demo.student.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class MyConfig {
    @Bean
    public Student student01() {
        return new Student(
                "Kevin ",
                "kevinspaceyang@gmail.com",
                LocalDate.of(2000, Month.JANUARY, 5)
        );
    }

}
