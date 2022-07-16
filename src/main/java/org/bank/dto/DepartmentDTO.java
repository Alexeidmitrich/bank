package org.bank.dto;

import org.bank.domain.Department;
import org.bank.domain.Employee;
import java.util.List;

public class DepartmentDTO {

    private int id;
    private String city;
    private List<Employee> employees;


    public DepartmentDTO(Department department) {
        this.id = department.getId();
        this.city = department.getCity();
        this.employees = department.getEmployeeList();
    }

    public DepartmentDTO(int id, String city, List<Employee> employeeList) {
        this.id = id;
        this.city = city;
        this.employees = employeeList;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}
