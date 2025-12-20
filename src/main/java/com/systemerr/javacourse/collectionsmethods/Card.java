package com.systemerr.javacourse.collectionsmethods;

public record Card(Suit suit, Rank rank) {
    @Override
    public String toString() {
        return suit().toString() + rank().toString();
    }
}
