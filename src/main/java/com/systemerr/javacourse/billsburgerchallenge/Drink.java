package com.systemerr.javacourse.billsburgerchallenge;

public class Drink extends Item {
    private String size;

    public Drink(String type, String size, double priceForMedium) {
        super(type, calculatePrice(size, priceForMedium));
        this.size = size;
    }

    public static double calculatePrice(String size, double priceForMedium) {
        double price = priceForMedium;
        switch (size) {
            case "S":
                price -= 1;
                break;
            case "L":
                price += 1;
                break;
            default:
                break;
        }

        return price;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
