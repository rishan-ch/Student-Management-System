package com.SMS.service.implementation;

import com.SMS.Repository.TeacherRepository;
import com.SMS.model.Teacher;
import com.SMS.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImplementation implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public void addTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public void deleteTeacher(int id) {
        teacherRepository.deleteById(id);
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public Teacher getTeacherById(int id) {
        return teacherRepository.findById(id).get();
    }

    @Override
    public List<Teacher> getAllTeacher() {
        return teacherRepository.findAll();
    }
}
