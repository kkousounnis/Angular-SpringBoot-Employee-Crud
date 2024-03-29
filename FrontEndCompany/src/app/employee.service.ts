import { HttpClient } from '@angular/common/http'; 
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';
import { EmployeeResponse } from './employee-response';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private baseURL = "http://localhost:8081/api/employee";
  constructor(private httpClient: HttpClient) { }

  getEmployeesList(): Observable<Employee[]> {
    
    return this.httpClient.get<Employee[]>(`${this.baseURL}`);
  }

  createEmployee(employee: EmployeeResponse): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, employee)
  }

  getEmployeeById(id: number): Observable<Employee>{
    return this.httpClient.get<Employee>(`${this.baseURL}/${id}`);
  }

  updateEmployee(id: number, employee: Employee): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${id}`, employee);
  }

  deleteEmployee(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }
}
