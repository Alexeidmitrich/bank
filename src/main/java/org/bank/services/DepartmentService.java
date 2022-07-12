package org.bank.services;

import org.bank.domain.Department;
import org.bank.domain.Employee;
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


    public List<Employee> getEmployeesByDepartmentId(int id) {
        Department department = getDepartmentById(id);
        return department.getEmployeeList();
    }

    public void saveDepartment(Department department){
        repository.save(department);
    }

    public void updateDepartment(int id, Department department){
        Department oldDepartment = repository.getReferenceById(id);
        oldDepartment.setCity(department.getCity());
        repository.save(oldDepartment);
    }
    public void deleteDepartment(int id){
        repository.deleteById(id);
    }
}
