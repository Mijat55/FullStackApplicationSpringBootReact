package com.markocodes.studetsystem.service;

import com.markocodes.studetsystem.model.Student;
import com.markocodes.studetsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudenServiceImpl implements  StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudendt(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
