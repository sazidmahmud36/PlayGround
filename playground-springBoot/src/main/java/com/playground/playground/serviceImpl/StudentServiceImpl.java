package com.playground.playground.serviceImpl;

import com.playground.playground.entity.Student;
import com.playground.playground.repository.StudentRepo;
import com.playground.playground.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student createStudent(Student student) {
        return null;
    }

    @Override
    public Student getStudentById(Long stuId) {
        return null;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
