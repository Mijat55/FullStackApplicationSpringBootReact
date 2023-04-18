package com.markocodes.studetsystem.controller;

import com.markocodes.studetsystem.model.Student;
import com.markocodes.studetsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/student")

public class StudnetController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/add")

    public String add(@RequestBody Student student){
        studentService.saveStudendt(student);
        return "New student is added";
    }
    @GetMapping("/getAll")
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();

    }
}
//
