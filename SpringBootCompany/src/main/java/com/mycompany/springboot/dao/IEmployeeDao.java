package com.mycompany.springboot.dao;

import com.mycompany.springboot.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeDao extends JpaRepository<Employee, Integer>{

}
