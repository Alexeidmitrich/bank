package org.bank.services;


import org.bank.domain.Employee;
import org.bank.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;


    public List<Employee> getAllEmployees(){
        return repository.findAll();
    }
    public Employee getEmployeeById(int id){
        return repository.findById(id).get();
    }
}
