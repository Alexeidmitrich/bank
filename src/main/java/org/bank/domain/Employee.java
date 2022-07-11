package org.bank.domain;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee extends Person {
    @Column(name = "salary")
    protected double salary;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "number_department", nullable = false)
    protected Department bank;

    public Employee(int number, String firstname, String lastname, double salary) {
        super(number, firstname, lastname);
        this.salary = salary;
        //this.department = department;
    }

    public Employee(String firstname, String lastname, double salary, Department bank) {
        super(firstname, lastname);
        this.salary = salary;
        this.bank = bank;
    }
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
                ", bank=" + bank +
                '}';
    }
}

