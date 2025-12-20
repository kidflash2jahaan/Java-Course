package com.systemerr.javacourse.collectionsmethods;

public class Dealer extends Player {
    public Dealer() {
        super();
    }

    @Override
    public String getName() {
        return "DEALER";
    }

    @Override
    public void startTurn() {
        System.out.println();
        printHand();

        if (getTotal() <= 16) {
            setHitNextTurn(true);
            System.out.println(getName() + " Has Chosen to Hit");
        } else {
            setHitNextTurn(false);
            System.out.println(getName() + " Has Chosen to Stand");
        }
        System.out.println();
    }

    public void printWin(Player player) {
        if (player.getTotal() > getTotal()) {
            System.out.println(player.getName() + " Has Won!");
        } else if (player.getTotal() < getTotal()) {
            System.out.println(player.getName() + " Has Won!");
        } else {
            System.out.println(player.getName() + " Has Tied!");
        }
    }
}
