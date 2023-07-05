package com.damondeng.spapp.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.damondeng.spapp.repository.EmployeeRepository;
import com.damondeng.spapp.model.Employee;


@Service
public class EmployeeService {
    
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }
}