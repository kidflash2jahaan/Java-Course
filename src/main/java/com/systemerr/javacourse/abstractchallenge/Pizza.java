package com.systemerr.javacourse.abstractchallenge;

public class Pizza extends ProductForSale {
    public Pizza(String type, double price, String description) {
        super(type, price, description);
    }
    @Override
    public String showDetails() {
        return "Pizza with " + getDescription() + ": $" + getSalesPrice(1) + " per slice";
    }
}
