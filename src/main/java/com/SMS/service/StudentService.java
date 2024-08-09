package com.SMS.service;

import com.SMS.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public interface StudentService{
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(int id);
    Student getStudentById(int id);
    List<Student> getAllStudent();
}
