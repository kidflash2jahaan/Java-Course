package com.systemerr.javacourse.abstractchallenge;

public class RTX5090 extends ProductForSale {
    public RTX5090(String type, double price, String description) {
        super(type, price, description);
    }
    
    @Override
    public String showDetails() {
        return "NVIDIA RTX 5090: $" + getPrice();
    }
}
