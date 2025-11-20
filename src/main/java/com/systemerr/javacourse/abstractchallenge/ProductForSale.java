package com.systemerr.javacourse.abstractchallenge;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return this.type;
    }

    public double getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public double getSalesPrice(int quantity) {
        return price * quantity;
    }

    public void printPricedItem(int quantity) {
        System.out.println("Description: " + description + "  |  Type: " + type + "  |  Unit Price: " + price + "  |  Quantity: " + quantity + "  |  Total Price: " + getSalesPrice(quantity));
    }

    public abstract String showDetails();
}
