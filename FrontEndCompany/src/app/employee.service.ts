import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core'; 
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private baseURL = "http://localhost:8080/api/employee";
  constructor(private httpClient: HttpClient) { }

  getEmployeesList(): Observable<Employee[]> {
    console.log(this.httpClient.get<Employee[]>(`${this.baseURL}`));
    return this.httpClient.get<Employee[]>(`${this.baseURL}`);
  }
}
