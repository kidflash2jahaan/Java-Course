package com.systemerr.javacourse.readinguserinputchallenge;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        while (numbers.size() != 5) {
            System.out.print("Enter number #" + (numbers.size() + 1) + ": ");
            try {
                numbers.add(Integer.parseInt(scanner.nextLine()));
            } catch (Exception e) {
                System.out.println("Invalid number");
            }
        }
        int[] sum = {0};
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer number) {
                sum[0] += number;
            }
        });
        System.out.println(sum[0]);
        scanner.close();
    }
}
