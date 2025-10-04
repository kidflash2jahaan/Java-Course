package com.systemerr.javacourse.constructorchallenge;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("customer1", 1, "customer1@gmail.com");
        Customer customer2 = new Customer("customer2", "customer2@gmail.com");
        Customer customer3 = new Customer();

        System.out.println("Customer 1: " + customer1.getName() + ", " + customer1.getLimit() + ", " + customer1.getEmail());
        System.out.println("Customer 2: " + customer2.getName() + ", " + customer2.getLimit() + ", " + customer2.getEmail());
        System.out.println("Customer 3: " + customer3.getName() + ", " + customer3.getLimit() + ", " + customer3.getEmail());
    }
}
