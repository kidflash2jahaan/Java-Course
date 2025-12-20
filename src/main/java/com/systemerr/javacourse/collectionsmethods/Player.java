package com.systemerr.javacourse.collectionsmethods;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private int playerNumber;
    private ArrayList<Card> hand;
    private boolean hitNextTurn;

    public Player(int playerNumber) {
        this.playerNumber = playerNumber;
        this.hand = new ArrayList<>();
        this.hitNextTurn = true;
    }

    public Player() {
        this(0);
    }

    public boolean hasBust() {
        if (getTotal() > 21) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getHitNextTurn() {
        return this.hitNextTurn;
    }

    public void setHitNextTurn(boolean hitNextTurn) {
        this.hitNextTurn = hitNextTurn;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public String getName() {
        return "PLAYER " + playerNumber;
    }

    public void startTurn() {
        System.out.println();
        printHand();

        System.out.println("Press 'S' To Stand");
        System.out.println("Press 'H' To Hit");
        System.out.print(">>> ");
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.nextLine().toUpperCase().startsWith("H")) {
            hitNextTurn = true;
            System.out.println(getName() + " Has Chosen to Hit");
        } else {
            hitNextTurn = false;
            System.out.println(getName() + " Has Chosen to Stand");
        }
        System.out.println();
    }

    public void printHand() {
        System.out.println(getName());

        hand.forEach(card -> {
            System.out.print(card + " | ");
        });
        System.out.println("TOTAL: " + getTotal());
    }

    public int getTotal() {
        int total = 0;
        for (Card card : hand) {
            total += card.rank().value;
            if (card.rank().toString().equals("A") && total + 10 <= 21) {
                total += 10;
            }
        }
        return total;
    }
}
