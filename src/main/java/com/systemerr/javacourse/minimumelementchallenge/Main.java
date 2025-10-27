package com.systemerr.javacourse.minimumelementchallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = readIntegers();
        System.out.println(Arrays.toString(array));
        System.out.println(findMin(array));
    }

    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        String response = scanner.nextLine();
        scanner.close();

        String[] elementsString = response.split(",");
        int[] elements = new int[elementsString.length];
        for (int i = 0; i < elementsString.length; i++) {
            elements[i] = Integer.parseInt(elementsString[i]);
        }

        return elements;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }

        return min;
    }
}
