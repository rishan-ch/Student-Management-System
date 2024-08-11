package com.SMS.controller;

import com.SMS.model.Teacher;
import com.SMS.service.implementation.TeacherServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherServiceImplementation teacherService;

    @PostMapping("/addTeacher")
    public ResponseEntity<String> addTeacher(@RequestBody Teacher teacher){

        teacherService.addTeacher(teacher);
        System.out.println(teacher.getName()+" added as teacher");
        return new ResponseEntity<>(teacher.getName()+" added as teacher", HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteTeacher/{id}")
    public ResponseEntity<String> deleteTeacher(@PathVariable int id){
        Teacher teacherObj = teacherService.getTeacherById(id);
        String name = teacherObj.getName();
        teacherService.deleteTeacher(id);

        return new ResponseEntity<>(name+" has been removed",HttpStatus.CREATED);
    }

    @PostMapping("/editTeacher/{id}")
    public Teacher editTeacher(@PathVariable int id){
        return teacherService.getTeacherById(id);
    }

    @PutMapping("/updateTeacher")
    public ResponseEntity<String> updateTeacher(@RequestBody Teacher teacher){
        teacherService.updateTeacher(teacher);
        return new ResponseEntity<>(teacher.getName()+" has been updated",HttpStatus.CREATED);
    }

    @PostMapping("/getAllTeacher")
    public List<Teacher> getALlTeacher(){
        return teacherService.getAllTeacher();
    }
}
