package com.playground.playground.service;

import com.playground.playground.entity.Student;
import java.util.List;
public interface StudentService {
    Student createStudent(Student student);
    Student getStudentById(Long stuId);
    List<Student> getAllStudent();
    Student updateStudent(Student student);
    void deleteById(Long stuId);


}
