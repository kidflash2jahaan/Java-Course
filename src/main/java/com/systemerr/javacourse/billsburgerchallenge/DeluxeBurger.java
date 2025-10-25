package com.systemerr.javacourse.billsburgerchallenge;

import java.util.ArrayList;

public class DeluxeBurger extends Burger {
    public DeluxeBurger(String type, double price) {
        super(type, price);
    }

    @Override
    public boolean addToppings(Topping topping) {
        if (getToppings().size() > 2) {
            return false;
        }
        ArrayList<Topping> toppings = getToppings();
        toppings.add(topping);
        setToppings(toppings);
        return true;
    }
}