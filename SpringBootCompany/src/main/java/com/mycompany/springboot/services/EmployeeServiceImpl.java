package com.mycompany.springboot.services;

import com.mycompany.springboot.entities.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mycompany.springboot.dao.EmployeeDao;

@Repository
public class EmployeeServiceImpl implements EmployeeService {
    
    @Autowired
    private EmployeeDao dao;
    
    @Override
    public List<Employee> get() {
        return dao.get();
    }
    
    @Override
    public Employee get(int id) {
        return dao.get(id);
    }
    
    @Override
    public void save(Employee employee) {
        dao.save(employee);
    }
    
    @Override
    public void delete(int id) {
        dao.delete(id);
    }
    
}
