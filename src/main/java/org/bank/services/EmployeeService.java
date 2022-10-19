package org.bank.services;


import org.bank.domain.Department;
import org.bank.domain.Employee;
import org.bank.exception.PersonNotFoundException;
import org.bank.repositories.DepartmentRepository;
import org.bank.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;
    @Autowired
    private DepartmentRepository departmentRepository;


    public List<Employee> getAllEmployees(){
        return repository.findAll();
    }
    public Employee getEmployeeById(int id){
        return repository.findById(id).orElseThrow(() -> new PersonNotFoundException("Employee wiht id" + id + " was not found"));
    }
    public void deleteEmployee(int id){
        repository.deleteById(id);
    }
    public void addNewEmployee(Employee employee){
        Department department = departmentRepository.findById(employee.getBank().getId()).get();
        employee.setBank(department);
        repository.save(employee);
    }
    public void updateEmployee(int id, Employee employee){
        Employee oldEmployee = repository.getReferenceById(id);
        oldEmployee.setFirstname(employee.getFirstname());
        repository.save(oldEmployee);
    }
}
