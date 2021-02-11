package com.mycompany.springboot.controllers;

import com.mycompany.springboot.entities.Employee;
import com.mycompany.springboot.entities.dtos.responses.EmployeeResponse;
import com.mycompany.springboot.services.EmployeeServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
    public EmployeeResponse get() {  
        
        return (new EmployeeResponse(employeeService.get()));
    }

    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employee) {
        employeeService.save(employee);
        return (employee);
    }

    @GetMapping("/employee/{id}")
    public Employee get(@PathVariable int id) {
        return employeeService.get(id);
    }

    @DeleteMapping("/employee/{id}")
    public String delete(@PathVariable int id) {
        employeeService.delete(id);
        return "Employee removed with id "+id;
    }
    
    @PutMapping("/employee")
    public Employee update (@RequestBody Employee employee){
        employeeService.save(employee);
        return employee;
    }

}
