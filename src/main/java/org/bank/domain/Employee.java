package org.bank.domain;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@number")

public class Employee extends Person {
    @Column(name = "salary")
    protected double salary;
    /*@Column(name = "number_department")
    protected Department department;*/

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.EAGER)
    @JoinColumn(name = "bank_id", nullable = false)
    @JsonManagedReference
    //@JsonIgnoreProperties("employeeList")
    protected Department bank;


    public Employee(){
    }
    public void printEmployee(){
        System.out.println(getNumber() + " " + getFirstname() + " " + getLastname() + " " + getSalary());
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }


    public double getSalary() {
        return salary;
    }

    public Department getBank() {
        return bank;
    }

    public void setBank(Department bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }
}

