package com.mycompany.springboot.entities.dtos.requests;

import com.mycompany.springboot.entities.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequest {

    private Employee employee;
}
