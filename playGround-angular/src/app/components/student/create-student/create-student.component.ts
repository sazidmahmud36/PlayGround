import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { StudentModel } from 'src/app/model/student-model';
import { StudentService } from 'src/app/services/student.service';

@Component({
  selector: 'app-create-student',
  templateUrl: './create-student.component.html',
  styleUrls: ['./create-student.component.css']
})
export class CreateStudentComponent {

  constructor(
    private studentService: StudentService,
    private router: Router,
  ){}
  student: StudentModel = new StudentModel();


  test!: String;

  // student = {
  //   stuId: null,
  //   name: '',
  //   email: '',
  //   location: '',
  //   gender: ''
  // };


  addStudent() {
    this.studentService.createStudent(this.student).subscribe({
      next: (res)=>{
        console.log('Student added:', res);
        this.router.navigate(["/students"]);
      },
      error: err =>{
        console.error('Error:', err);
      }
    });
  }




}
