package com.SMS.service;

import com.SMS.Repository.TeacherRepository;
import com.SMS.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeacherService {
    void addTeacher(Teacher teacher);
    void deleteTeacher(int id);
    void updateTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    List<Teacher> getAllTeacher();
}
