package com.systemerr.javacourse.abstractchallenge;

public class OrderItem {
    private double quantity;
    private ProductForSale product;

    public OrderItem(double quantity, ProductForSale product) {
        this.quantity = quantity;
        this.product = product;
    }

    public double getQuantity() {
        return this.quantity;
    }

    public ProductForSale getProduct() {
        return this.product;
    }
}
