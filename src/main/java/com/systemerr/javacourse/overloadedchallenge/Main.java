package com.systemerr.javacourse.overloadedchallenge;

public class Main {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(67));
        System.out.println(convertToCentimeters(6, 7));
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return (feet * 12 + inches) * 2.54;
    }
}
