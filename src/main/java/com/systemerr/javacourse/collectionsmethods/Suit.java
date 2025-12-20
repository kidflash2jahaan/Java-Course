package com.systemerr.javacourse.collectionsmethods;

public enum Suit {
    CLUB, SPADE, HEART, DIAMOND;

    @Override
    public String toString() {
        switch (this) {
            case CLUB:
                return "\u2663";
            case SPADE:
                return "\u2660";
            case HEART:
                return "\u2665";
            case DIAMOND:
                return "\u2666";
            default:
                return "ERROR";
        }
    }
}
