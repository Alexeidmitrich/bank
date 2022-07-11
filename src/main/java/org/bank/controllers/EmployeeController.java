package org.bank.controllers;

import org.bank.domain.Employee;
import org.bank.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employees")
    public List<Employee> getEmployee(){
        return employeeService.getAllEmployees();
    }
    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return  employeeService.getEmployeeById(id);
    }
    @DeleteMapping("/employees")
    public String deleteEmployee(@PathVariable int id){
       employeeService.deleteEmployee(id);
        return "Ok";
    }
    @PostMapping("/employees")
    public String addNewEmployee(@RequestBody Employee employee){
        employeeService.addNewEmployee(employee);
        return "Ok";
    }
    @PutMapping("/employees/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody Employee employee){
        employeeService.updateEmployee(id,employee);
        return "Ok";
    }
}
