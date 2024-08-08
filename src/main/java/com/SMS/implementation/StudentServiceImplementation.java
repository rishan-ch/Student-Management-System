package com.SMS.implementation;

import com.SMS.Repository.StudentRepository;
import com.SMS.model.Student;
import com.SMS.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImplementation implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }
}
