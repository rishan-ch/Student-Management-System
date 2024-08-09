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

    @PostMapping("/deleteStudent/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
        System.out.println("Student deleted");
        return new ResponseEntity<>("Student deleted", HttpStatus.CREATED);
    }

}
