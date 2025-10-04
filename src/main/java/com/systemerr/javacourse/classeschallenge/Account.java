package com.systemerr.javacourse.classeschallenge;

public class Account {
    private int number;
    private double balance;
    private String name;
    private String email;
    private int phone;

    public Account(int number, double balance, String name, String email, int phone) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount < 0) return;
        balance -= amount;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
