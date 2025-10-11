package com.systemerr.javacourse.encapsulationchallenge;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(0));
        System.out.println(printer.addToner(100));
        System.out.println(printer.addToner(25));
        System.out.println(printer.printPages(5));
    }
}
