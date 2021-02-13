package com.mycompany.springboot.controllers;

import com.mycompany.springboot.entities.Employee;
import com.mycompany.springboot.entities.dtos.responses.EmployeeResponse;
import com.mycompany.springboot.services.EmployeeServiceImpl;
import com.mycompany.springboot.entities.dtos.requests.EmployeeRequest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/employee")
    public List<Employee> get() {

        return (new EmployeeResponse(employeeService.get()).getEmployees());
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/employee")
    public Employee save(@RequestBody EmployeeRequest employee) {  //to change to EmployeeRequest issue with angular    
        System.out.println(employee.getEmployee());
        employeeService.save(employee.getEmployee());
        return (employee.getEmployee());
    }

    @GetMapping("/employee/{id}")
    public Employee get(@PathVariable int id) {
        return employeeService.get(id);
    }

    @DeleteMapping("/employee/{id}")
    public String delete(@PathVariable int id) {
        employeeService.delete(id);
        return "Employee removed with id " + id;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/employee/{id}")
    public ResponseEntity<Employee> update(@PathVariable int id, @RequestBody Employee employeeDetails) {
        Employee employee = employeeService.get(id);

        employee.setFirstName(employeeDetails.getFirstName());
        employee.setLastName(employeeDetails.getLastName());
        employee.setEmailId(employeeDetails.getEmailId());
        System.out.println(employee);
        employeeService.save(employee);
        return ResponseEntity.ok(employee);
    }

}
