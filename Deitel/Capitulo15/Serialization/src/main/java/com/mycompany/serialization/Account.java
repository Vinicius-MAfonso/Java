package com.mycompany.serialization;

import java.io.Serializable;

public class Account implements Serializable{
    private int account;
    private String firstName;
    private String lastName;
    private double balance;
    public Account(int _account, String _firstName, String _lastName, double _balance){
        this.account = _account;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.balance = _balance;
    }
    public Account(){
        this(0,"","",0);
    }
    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
