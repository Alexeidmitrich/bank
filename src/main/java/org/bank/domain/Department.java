package org.bank.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.bank.dto.DepartmentDTO;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bank")
@XmlRootElement
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bankid")
    @XmlElement
    private int id;
    @XmlElement
    private String city;
   //@JsonBackReference
   @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST}, mappedBy = "department", targetEntity = Client.class)
   private List<Client> clientsList = new ArrayList<>();


    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "bank", targetEntity = Employee.class)
    private List<Employee> employeeList = new ArrayList<>();

    public Department() {

    }

    public Department(String city) {
        this.city = city;
    }

    public Department(int id, String city) {
        this.id = id;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public  void print(){
        System.out.println(id + " " + city);
    }

    public DepartmentDTO toDepartmentDTO() {
        return new DepartmentDTO(this);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", city='" + city + '\'' +
                '}';
    }

}