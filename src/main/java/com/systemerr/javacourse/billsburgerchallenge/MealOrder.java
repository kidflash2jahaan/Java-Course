package com.systemerr.javacourse.billsburgerchallenge;

public class MealOrder {
    private Burger burger;
    private Drink drink;
    private Side side;

    public MealOrder(Burger burger, Drink drink, Side side) {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
    }

    public MealOrder() {
        this(
            new Burger("Regular", 5),
            new Drink("Coke", "S", 3),
            new Side("Fries", 2)
        );
    }

    public Burger getBurger() {
        return this.burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    public Drink getDrink() {
        return this.drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Side getSide() {
        return this.side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

}
