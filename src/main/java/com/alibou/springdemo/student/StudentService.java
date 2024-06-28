package com.alibou.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


public interface StudentService {

   Student save(Student s);
   List<Student> findallstudents();
   Student findByEmail(String email);
   Student update(Student s);
   void delete(String email);
}
