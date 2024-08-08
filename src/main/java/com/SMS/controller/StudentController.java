package com.SMS.controller;

import com.SMS.implementation.StudentServiceImplementation;
import com.SMS.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentServiceImplementation studentService;

    @PostMapping("/addStudent")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        System.out.println("Student added");
        return new ResponseEntity<>("Student added", HttpStatus.CREATED);
    }
}
