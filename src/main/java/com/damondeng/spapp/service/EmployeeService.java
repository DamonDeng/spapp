package com.damondeng.spapp.service;

import org.springframework.stereotype.Service;
import java.util.List;

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