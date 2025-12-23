package com.systemerr.javacourse.treesetchallenge;

import java.util.Iterator;
import java.util.TreeSet;

public class Theater {
    private String name;
    private int rows;
    private int rowCapacity;
    private TreeSet<Seat> seats;

    public Theater(String name, int rows, int totalSeats) {
        this.name = name;
        this.rows = rows;
        this.rowCapacity = totalSeats / rows;
        this.seats = new TreeSet<>();
        for (int row = 0; row < rows; row++) {
            for (int number = 0; number < rowCapacity; number++) {
                seats.add(new Seat((char) (row + 65), number + 1));
            }
        }
    }

    public String getName() {
        return name;
    }

    public void printSeatMap() {
        Iterator<Seat> seatIterator = seats.iterator();
        for (int row = 0; row < rows; row++) {
            for (int number = 0; number < rowCapacity; number++) {
                Seat seat = seatIterator.next();
                if (seat.isReserved()) {
                    System.out.print(" | " + "RSVD");
                } else {
                    System.out.print(" | " + seat);
                }
            }
            System.out.println(" | ");
            for (int i = 0; i < 7 * rowCapacity + 3; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public boolean reserveSeat(Seat selectedSeat) {
        Seat seat = seats.floor(selectedSeat);
        if (seat.getRow() != selectedSeat.getRow() || seat.getNumber() != selectedSeat.getNumber() || seat.isReserved()) {
            return false;
        }
        seat.setReserved(true);
        return true;
    }
}
