package com.company;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean debit(double amount){
        if(amount <= 0){
            return false;
        }
        if(amount > balance){
            return false;
        } else {
            balance = balance - amount;
            return true;
        }
    }

    public boolean credit(double amount){
        if(amount <= 0){
            return false;
        } else {
            balance = balance + amount;
            return true;
        }
    }
}
