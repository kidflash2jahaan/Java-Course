package com.systemerr.javacourse.treesetchallenge;

public class Seat implements Comparable<Seat> {
    private char row;
    private int number;
    private boolean reserved;

    public Seat(char row, int number) {
        this.row = row;
        this.number = number;
        this.reserved = false;
    }

    public char getRow() {
        return row;
    }

    public int getNumber() {
        return number;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    @Override
    public String toString() {
        return row + String.format("%03d", number);
    }

    @Override
    public int compareTo(Seat o) {
        if (row == o.getRow()) return Integer.compare(number, o.getNumber());
        return Character.compare(row, o.getRow());
    }
}
