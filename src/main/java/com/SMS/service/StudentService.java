package com.SMS.service;

import com.SMS.model.Student;
import org.springframework.stereotype.Service;

public interface StudentService{
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(int id);
}
