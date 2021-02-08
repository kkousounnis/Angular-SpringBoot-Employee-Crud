package com.mycompany.springboot.services;

import java.util.List;
import com.mycompany.springboot.entities.Employee;

public interface EmployeeService {

    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);

}
