package com.markocodes.studetsystem.controller;

import com.markocodes.studetsystem.model.Student;
import com.markocodes.studetsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



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
}