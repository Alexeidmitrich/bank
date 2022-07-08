package org.bank.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee extends Person {

    protected double salary;

    /*@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "number_department", nullable = false)
    protected BankDepartment bankDepartment;
*/
    public Employee(int number, String firstname, String lastname, double salary) {
        super(number, firstname, lastname);
        this.salary = salary;
    }

    public Employee(String firstname, String lastname, double salary) {
        super(firstname, lastname);
        this.salary = salary;

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

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }
}

