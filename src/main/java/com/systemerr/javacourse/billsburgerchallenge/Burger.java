package com.systemerr.javacourse.billsburgerchallenge;

import java.util.ArrayList;

public class Burger extends Item {
    private ArrayList<Topping> toppings;

    public Burger(String type, double price) {
        super(type, price);
        this.toppings = new ArrayList<>();
    }

    public boolean addToppings(Topping topping) {
        if (toppings.size() > 3) {
            return false;
        }
        toppings.add(topping);
        setPrice(getPrice() + topping.getPrice());
        return true;
    }

    public ArrayList<Topping> getToppings() {
        return this.toppings;
    }

    public void setToppings(ArrayList<Topping> toppings) {
        this.toppings = toppings;
    }
}
