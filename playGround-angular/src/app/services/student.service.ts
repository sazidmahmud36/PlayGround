import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
import { StudentModel } from '../model/student-model';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  constructor(private http:HttpClient) { }
  private baseUrl:string = "http://localhost:8080/api/student/";

  getAllStudents():Observable<StudentModel[]>{
    return this.http.get<StudentModel[]>(this.baseUrl);
  }


}
