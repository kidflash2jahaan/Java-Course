package com.systemerr.javacourse.collectionsmethods;

import java.util.ArrayList;

public class Main {
    public static int nPlayers = 2;

    public static void main(String[] args) {
        Deck deck = new Deck();
        ArrayList<Player> players = new ArrayList<>();
        for (int i = 0; i < nPlayers; i++) {
            players.add(new Player(i + 1));
        }
        players.add(new Dealer());
        for (int i = 0; i < 2; i++) {
            players.forEach(deck::dealCard);
        }
        while (true) {
            players.forEach(player -> {
                if (player.getHitNextTurn()) {
                    player.startTurn();
                }
            });
            System.out.println();
            boolean[] end = {true};
            players.forEach(player -> {
                if (player.getHitNextTurn()) {
                    end[0] = false;
                    deck.dealCard(player);
                }
                if (player.hasBust()) {
                    System.out.println(player.getName() + " Has Bust!");
                }
            });
            players.removeIf(Player::hasBust);
            if (end[0]) {
                Dealer dealer = (Dealer) players.getLast();
                players.removeLast();
                players.forEach(dealer::printWin);
                break;
            }
            System.out.println();
        }
    }
}
