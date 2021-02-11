import { Component, OnInit } from '@angular/core';
import { EmployeeListComponent } from '../employee-list/employee-list.component';
import { EmployeeResponse } from '../employee-response';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import { THIS_EXPR } from '@angular/compiler/src/output/output_ast';

@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.css']
})
export class CreateEmployeeComponent implements OnInit {
  employee: Employee = new Employee();
  //  https://grokonez.com/frontend/angular/angular-6/angular-6-send-nested-object-to-spring-boot-server-example
  constructor(private employeeService: EmployeeService,
    private router: Router) { }

  ngOnInit(): void {
  }

  saveEmployee() {
    this.employeeService.createEmployee(this.employee).subscribe(data => {
      this.goToEmployeeList();
    },
      error => console.log(error));
  }

  goToEmployeeList() {
    this.router.navigate(['/employees'])
  }
  onSubmit() {

    this.saveEmployee();
  }

}
