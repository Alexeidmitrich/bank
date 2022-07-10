package org.bank.domain;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee extends Person {

    protected double salary;

   /* @ManyToOne
    @JoinColumn(name = "bank_id", nullable = false)
    protected Department bank;
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

