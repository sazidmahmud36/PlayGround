import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { StudentModel } from 'src/app/model/student-model';
import { StudentService } from 'src/app/services/student.service';

@Component({
  selector: 'app-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.css']
})
export class StudentsComponent implements OnInit {
  constructor(
    private studentService: StudentService,
    private router: Router
  ) { }
  students: StudentModel[] = [];

  ngOnInit(): void {
    this.loadAllStudent();
  }


  loadAllStudent(): void {
    this.studentService.getAllStudents().subscribe({
      next: (res: StudentModel[]) => {
        console.log('Received students:', res); // Add this log
        this.students = res;
      },
      error: (err) => {
        console.log(err);
      }
    });
  }

  deleteStudent(stuId: number): void {
    if (confirm('Are you sure you want to delete this student?')) {
      this.studentService.deleteStudent(stuId).subscribe({
        next: () => {
          alert("Student Deleted Successfully!");
          this.router.navigate(["/students"]);
        }, error: (err) => {
          console.error('Error deleting student', err)
        }
      });
    }
  }



}
