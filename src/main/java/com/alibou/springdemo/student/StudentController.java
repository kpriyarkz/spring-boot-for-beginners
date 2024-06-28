package com.alibou.springdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController  {

    @Autowired
   private  StudentService service ;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student save(@RequestBody Student s) {
        return service.save(s);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email) {
        return service.findByEmail(email);
    }

    @PutMapping
    public Student update(@RequestBody Student s) {
        return service.update(s);
    }

    @DeleteMapping("/{email}")
    public void delete(@PathVariable String email) {
        service.delete(email);
    }

    @GetMapping()
    public List<Student> findallstudents()
    {
        return service.findallstudents();

    }


}
