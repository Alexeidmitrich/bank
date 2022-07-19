package org.bank.dto;

import org.bank.domain.Client;
import org.bank.domain.Department;


public class ClientDTO {

    private int number;

    private String firstname;

    private String lastname;

    private int serie;

    private String passnumber;

    private String email;

    private String phone;

    private Department department;

    public ClientDTO(Client client) {
        this.number = client.getNumber();
        this.firstname = client.getFirstname();
        this.lastname = client.getLastname();
        this.serie = client.getSerie();
        this.passnumber = client.getPassnumber();
        this.email = client.getEmail();
        this.phone = client.getPhone();
        this.department = client.getDepartment();
    }

    public ClientDTO(int number, String firstname, String lastname, int serie, String passnumber, String email, String phone,  Department department) {
        this.number = number;
        this.firstname = firstname;
        this.lastname = lastname;
        this.serie = serie;
        this.passnumber = passnumber;
        this.email = email;
        this.phone = phone;
        this.department = department;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getPassnumber() {
        return passnumber;
    }

    public void setPassnumber(String passnumber) {
        this.passnumber = passnumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
