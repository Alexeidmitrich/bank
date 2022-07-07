package org.bank.controllers;

import org.bank.domain.Client;
import org.bank.domain.Department;
import org.bank.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/department")
    public List<Department> getDepartment(){
        Department department = departmentService.getDepartmentById(1);
        System.out.println(department);
        return departmentService.getAllDepartment();
    }
    @GetMapping("/department/{id}")
    public Department getDepartmentById(@PathVariable int id) {

        return  departmentService.getDepartmentById(id);
    }
}
