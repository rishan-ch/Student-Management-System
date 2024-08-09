package com.SMS.controller;

import com.SMS.implementation.StudentServiceImplementation;
import com.SMS.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping("/editStudent/{id}")
    public Student getStudentInfo(@PathVariable int id){
        return studentService.getStudentById(id);
    }

    @PostMapping("/updateStudent")
    public ResponseEntity<String> updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
        System.out.println("Student updated");
        return new ResponseEntity<>("Student update", HttpStatus.CREATED);
    }


    @PostMapping("/allStudent")
    public ResponseEntity<List> allStudent(){
        return new ResponseEntity<>(studentService.getAllStudent(), HttpStatus.CREATED);
    }

}
