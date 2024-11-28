import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { StudentsComponent } from './components/student/students/students.component';


const routes: Routes = [
  {path: "students", component: StudentsComponent},
  { path: '**', redirectTo: 'students' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
