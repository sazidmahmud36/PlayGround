package com.playground.playground.service;

import com.playground.playground.entity.Student;
import com.playground.playground.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
//@AllArgsConstructor
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;


    public Student createStudent(@RequestBody Student student) {
        Student saveStudent = studentRepo.save(student);
        return saveStudent;
    }


    public Student getStudentById(Long stuId) {
        return null;
    }


    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    public Student updateStudent(Student student) {
        return null;
    }

    public void deleteById(Long id) {

        if (!studentRepo.existsById(id)){
            ResponseEntity.notFound().build();
        }else {
            studentRepo.deleteById(id);
        }

    }
}
