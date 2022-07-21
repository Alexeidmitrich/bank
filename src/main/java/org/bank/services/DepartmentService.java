package org.bank.services;

import org.bank.domain.Department;
import org.bank.exception.Departmentexception;
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
        return repository.findById(id).orElseThrow(() -> new Departmentexception("Department " + id + "  not found"));
    }

    public void saveDepartment(Department department){
        repository.save(department);
    }

    public void updateDepartment(int id, Department department){
        Department oldDepartment = getDepartmentById(id);
        oldDepartment.setCity(department.getCity());
        repository.save(oldDepartment);
    }
    public void deleteDepartment(int id){
        repository.deleteById(id);
    }
}
