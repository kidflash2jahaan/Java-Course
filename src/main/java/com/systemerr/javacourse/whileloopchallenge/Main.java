package com.systemerr.javacourse.whileloopchallenge;

public class Main {
    public static void main(String[] args) {
        int startNumber = 5;
        int number = startNumber;
        int evenCount = 0;
        int oddCount = 0;
        while (number <= 20) {
            if (isEvenNumber(number)) {
                evenCount++;
                System.out.println(number);
            } else oddCount++;
            if (evenCount == 5) break;
            number++;
        }
        System.out.println(evenCount + " Even, " + oddCount + " Odd");
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) return true;
        return false;
    }
}
