package org.bank.domain;

import org.bank.dto.ClientDTO;
import javax.persistence.*;


@Entity
@Table(name = "clients")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Client extends Person{
    @Column(nullable = false, length = 10)
    protected int serie;
    @Column(nullable = false, length = 15)
    protected String passnumber;
    @Column(nullable = false, length = 35)
    protected String email;
    @Column(nullable = false, length = 12)
    protected String phone;
    @Column(nullable = false, length = 500)
    protected String password;
    @Column(nullable = false, length = 200)
    protected String salt;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.EAGER)
    @JoinColumn(name = "number_department")
    protected Department department;

    public Client() {
    }

    public Client(int number, String firstname, String lastname, int serie, String passnumber, String email, String phone, String password, String salt) {
        super(number, firstname, lastname);
        this.serie = serie;
        this.passnumber = passnumber;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.salt = salt;
    }
    public Client(String firstname, String lastname, int serie, String passnumber, String email, String phone, String password, String salt){
        super(firstname, lastname);
        this.serie = serie;
        this.passnumber = passnumber;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.salt = salt;
    }

    public int getSerie() {
        return serie;
    }

    public String getPassnumber() {
        return passnumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public void setPassnumber(String passnumber) {
        this.passnumber = passnumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    public ClientDTO toClientDTO(){
        return new ClientDTO(this);
    }

    public void printClient(){
        System.out.println(getFirstname() + " " + getLastname() + " " + getSerie() + " " + getPassnumber() + " " + getEmail() + " " + getPhone() );
    }
}
