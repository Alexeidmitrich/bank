package org.bank.domain;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "bankproduct")
public class BankProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String title;
    int amount;

    public BankProduct(int id, String title, int amount) {
        this.id = id;
        this.title = title;
        this.amount = amount;
    }
    public BankProduct(String title, int amount){
        this.title = title;
        this.amount = amount;
    }
    public BankProduct(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void  printInformation(){
        System.out.println("id: " +id + ", title " + title + ", amount "  + amount);
    }
}
