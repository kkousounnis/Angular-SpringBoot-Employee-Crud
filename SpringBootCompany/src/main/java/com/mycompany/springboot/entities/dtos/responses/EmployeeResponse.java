package com.mycompany.springboot.entities.dtos.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.mycompany.springboot.entities.Employee;
import java.util.List;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeResponse extends Response {

    private List<Employee> employees;
    private Employee employee;
    private Integer employeeId;

    public EmployeeResponse(List<Employee> employees) {
        this.employees = employees;
    }

}
