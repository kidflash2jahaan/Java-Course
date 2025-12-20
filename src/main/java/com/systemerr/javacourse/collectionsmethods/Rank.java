package com.systemerr.javacourse.collectionsmethods;

public enum Rank {
    ACE("A", 1),
    N2(2),
    N3(3),
    N4(4),
    N5(5),
    N6(6),
    N7(7),
    N8(8),
    N9(9),
    N10(10),
    JACK("J", 10),
    QUEEN("Q", 10),
    KING("K", 10);
    
    public final String name;
    public final int value;

    private Rank(String name, int value) {
        this.name = name;
        this.value = value;
    }

    private Rank(int value) {
        this(String.valueOf(value), value);
    }

    @Override
    public String toString() {
        return name;
    }
}
