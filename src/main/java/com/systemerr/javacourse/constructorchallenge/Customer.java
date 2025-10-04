package com.systemerr.javacourse.constructorchallenge;

public class Customer {
    private String name;
    private double limit;
    private String email;

    public Customer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public Customer(String name, String email) {
        this(name, 0, email);
    }

    public Customer() {
        this("name", "email");
    }
    
    public String getName() {
        return this.name;
    }

    public double getLimit() {
        return this.limit;
    }

    public String getEmail() {
        return this.email;
    }

}
