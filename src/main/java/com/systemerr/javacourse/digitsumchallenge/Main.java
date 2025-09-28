package com.systemerr.javacourse.digitsumchallenge;

public class Main {
    public static void main(String[] args) {
        System.out.println("125: " + sumDigits(125));
        System.out.println("1000: " + sumDigits(1000));
        System.out.println("5: " + sumDigits(5));
        System.out.println("-5: " + sumDigits(-5));
    }

    public static int sumDigits(int number) {
        if (number <= 0) return -1;

        int sum = 0;
        while (number >= 10) {
            sum += number % 10;
            number = Math.floorDiv(number, 10);
        }
        sum += number;

        return sum;
    }
}
