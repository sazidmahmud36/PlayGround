package com.playground.playground.controller;

import com.playground.playground.entity.Student;
import com.playground.playground.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/student/")
@CrossOrigin("*")
public class StudentController {

    private StudentService studentService;
//    private StudentRepo studentRepo;
    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student savedStudent= studentService.createStudent(student);
        return ResponseEntity.ok(savedStudent);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> students = studentService.getAllStudent();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public void deleteStudent(@PathVariable ("id") Long id){
        studentService.deleteById(id);
    }

}
