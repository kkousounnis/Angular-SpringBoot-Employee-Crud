package com.mycompany.springboot.services;

import com.mycompany.springboot.dao.IEmployeeDao;
import com.mycompany.springboot.entities.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeService implements IEmployeeService {

    @Autowired
    private IEmployeeDao dao;

    @Override
    public List<Employee> get() {
        return dao.findAll();
    }

    @Override
    public Employee get(int id) {
        return dao.findById(id).get();
    }

    @Override
    public void save(Employee employee) {
        dao.save(employee);
    }

    @Override
    public void delete(int id) {
        dao.deleteById(id);
    }

}
