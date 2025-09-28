package com.systemerr.javacourse.minmaxchallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double max = 0;
        double min = 0;
        int i = 0;
        while (true) {
            System.out.print("Enter number: ");
            String response = scanner.nextLine();

            double number = 0;
            try {
                number = Double.parseDouble(response);
            } catch (Exception e) {
                break;
            }

            if (i == 0) {
                max = number;
                min = number;
            }

            max = Math.max(max, number);
            min = Math.min(min, number);

            System.out.println("Max: " + max);
            System.out.println("Min: " + min);

            i++;
        }

        scanner.close();
    }
}
