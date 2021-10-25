/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l1account;
import java.util.*;
/**
 *
 * @author hp
 */
public class Account {
    int id;
    double balance ;
    double annualinterestrate;
    Date datacreated;
            
    public Account() {
        this.id=0;
        this.annualinterestrate=0;
        this.balance=0;
        this.datacreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.datacreated = new Date();
        
    }

    public int getId() {
        this.datacreated = new Date();
        return id;
    }

    public void setId(int id) {
        this.datacreated = new Date();
        this.id = id;
    }

    public double getBalance() {
        this.datacreated = new Date();
        return balance;
    }

    public void setBalance(double balance) 
    {
        this.datacreated = new Date();
        this.balance = balance;
    }

    public double getAnnualinterestrate() {
        this.datacreated = new Date();
        return annualinterestrate;
    }

    public void setAnnualInterestRate(double rate) {
        this.datacreated = new Date();
        annualinterestrate =balance * rate;
    }

    public void setDatacreated(Date datacreated) {
        this.datacreated = datacreated;
    }
    double getMonthlyInterestRate()
    {
        return annualinterestrate / 12;
    }
    void withdraw(double amount )
    {   this.datacreated = new Date();
        balance -= amount;
    }
    
     void deposit(double amount )
    {   this.datacreated = new Date();
        balance += amount;
    }

    public Date getDatacreated() {
        return datacreated;
    }
    
     
     
}
