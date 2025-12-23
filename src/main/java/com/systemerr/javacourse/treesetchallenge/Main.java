package com.systemerr.javacourse.treesetchallenge;

public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater("Theater", 26, 208);
        theater.reserveSeat(new Seat('W', 5));
        theater.reserveSeat(new Seat('Y', 8));
        theater.reserveSeat(new Seat('W', 5));
        theater.reserveSeat(new Seat('Y', 0));
        theater.printSeatMap();
    }
}
