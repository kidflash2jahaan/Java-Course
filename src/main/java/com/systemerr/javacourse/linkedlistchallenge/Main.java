package com.systemerr.javacourse.linkedlistchallenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static <T> void main(String[] args) {
        LinkedList<Town> towns = new LinkedList<>(Arrays.asList(
            new Town("Sydney", 0),
            new Town("Adelaide", 1374),
            new Town("Alice Springs", 2771),
            new Town("Brisbane", 917),
            new Town("Darwin", 3972),
            new Town("Melbourne", 877),
            new Town("Perth", 3923)
        ));
        ListIterator<Town> townsIterator = towns.listIterator();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.print("Available actions (select word or letter):\n(F)orward\n(B)ackward\n(L)ist Places\n(M)enu\n(Q)uit\n>>> ");
            String response = scanner.nextLine();

            towns.sort(new Comparator<Town>() {
                @Override
                public int compare(Town town0, Town town1) {
                    return town0.getDistanceFromSydney() - town1.getDistanceFromSydney();
                }
            });

            switch (response.toLowerCase().charAt(0)) {
                case 'f':
                if (townsIterator.hasNext()) {
                    System.out.println(townsIterator.next());
                }
                break;

                case 'b':
                if (townsIterator.hasPrevious()) {
                    System.out.println(townsIterator.previous());
                }
                break;

                case 'm':
                break;

                case 'q':
                quit = true;
                break;

                case 'l':
                System.out.println(towns);
                break;

                default:
                System.out.println("Invalid Input");
                break;
            }
            System.out.println();
        }
        scanner.close();
    }
}
