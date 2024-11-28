package com.playground.playground.controller;

import com.playground.playground.entity.Student;
import com.playground.playground.serviceImpl.StudentServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/student")
@CrossOrigin("*")
public class StudentController {

    private StudentServiceImpl studentService;

    @GetMapping("/")
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> students = studentService.getAllStudent();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }


}
