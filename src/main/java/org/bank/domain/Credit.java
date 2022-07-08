package org.bank.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "credits")
public class Credit extends BankProduct{
    @Column(nullable = false, length = 3)
    protected int month;
    @Column(nullable = false, length = 10)
    protected int ranking;


    public Credit(int id, String title, int amount, int month, int ranking) {
        super(id, title, amount);
        this.month = month;
        this.ranking = ranking;
    }
    public Credit(String title, int amount, int month, int ranking){
        super(title, amount);
        this.month = month;
        this.ranking = ranking;
    }
    public Credit(){

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public void printInformation() {
        System.out.println("id: " + getId() + ", title " + getTitle() + ", amount "  + getAmount() + ", month " + getMonth() + ", ranking " + getRanking());
    }
}
