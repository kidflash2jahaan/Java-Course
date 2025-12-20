package com.systemerr.javacourse.collectionsmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> listOfCards;

    public Deck() {
        listOfCards = new ArrayList<>();
        for (int decks = 0; decks < 6; decks++) {
            for (int suitIndex = 0; suitIndex < Suit.values().length; suitIndex++) {
                for (int rankIndex = 0; rankIndex < Rank.values().length; rankIndex++) {
                    listOfCards.add(new Card(Suit.values()[suitIndex], Rank.values()[rankIndex]));
                }
            }
        }
        Collections.shuffle(listOfCards);
        int removeAmount = new Random().nextInt(60, 76);
        for (int removeIndex = 0; removeIndex < removeAmount; removeIndex++) {
            listOfCards.removeLast();
        }
    }

    public ArrayList<Card> getListOfCards() {
        return this.listOfCards;
    }

    public void dealCard(Player player) {
        Card card = listOfCards.getFirst();
        listOfCards.removeFirst();
        player.addCard(card);
    }
}
