package com.systemerr.javacourse.switchchallenge;

public class Main {
    public static void main(String[] args) {
        displayNATO('A');
        displayNATO('B');
        displayNATO('C');
        displayNATO('D');
        displayNATO('E');
        displayNATO('F');
    }

    public static void displayNATO(char letter) {
        switch (letter) {
            case 'A':
                System.out.println("A: Able");
                break;
            case 'B':
                System.out.println("B: Baker");
                break;
            case 'C':
                System.out.println("C: Charlie");
                break;
            case 'D':
                System.out.println("D: Dog");
                break;
            case 'E':
                System.out.println("E: Easy");
                break;
            default:
                System.out.println("not found");
                break;
        }
    }
}
