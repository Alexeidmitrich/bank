package org.bank.controllers;


import org.bank.domain.Department;
import org.bank.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/department")
    public String saveNewDepartment(@RequestBody  Department department) {
        departmentService.saveDepartment(department);
        return "OK";
    }

    @PutMapping("/department/{id}")
    public String updateDepartment(@PathVariable int id, @RequestBody Department department) {
        departmentService.updateDepartment(id, department);
        return "Ok";
    }
    @DeleteMapping("/department/{id}")
    public String deleteDepartment(@PathVariable int id){
        departmentService.deleteDepartment(id);
        return "Ok";
    }
}