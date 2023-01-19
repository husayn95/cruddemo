package com.example.cruddemo.DAO;

import com.example.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface EmployeeDAO {
    public List<Employee> findAll();
}
