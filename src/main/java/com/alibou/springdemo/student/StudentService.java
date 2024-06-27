package com.alibou.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findallstudents()
    {

        return List.of(
                new Student(
                        "Ali",
                        "BouAli",
                        LocalDate.now(),
                        "ali.baouli@gmail.com",
                        23)
                ,
                new Student(
                        "Shaun",
                        "BouAli",
                        LocalDate.now(),
                        "sahun.baouli@gmail.com",
                        27)
        );
    }
}
