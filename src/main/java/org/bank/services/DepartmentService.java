package org.bank.services;

import org.bank.domain.Department;
import org.bank.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository repository;


    public List<Department> getAllDepartment(){
        return repository.findAll();
    }
    public Department getDepartmentById(int id){
        return repository.findById(id).get();
    }
}
