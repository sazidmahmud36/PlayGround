package com.playground.playground.serviceImpl;

import com.playground.playground.entity.Student;
import com.playground.playground.repository.StudentRepo;
import com.playground.playground.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
//@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student createStudent(@RequestBody Student student) {
        Student saveStudent = studentRepo.save(student);
        return saveStudent;
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

        if (!studentRepo.existsById(id)){
            ResponseEntity.notFound().build();
        }else {
            studentRepo.deleteById(id);
        }

    }
}
