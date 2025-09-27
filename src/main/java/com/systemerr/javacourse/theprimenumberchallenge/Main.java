package com.systemerr.javacourse.theprimenumberchallenge;

public class Main {
    public static void main(String[] args) {
        int primeNumberCounter = 0;
        for (int number = 67; number <= 670; number++) {
            if (isPrime(number) == true) {
                System.out.println(number);
                primeNumberCounter++;
                if (primeNumberCounter == 3) break;
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
