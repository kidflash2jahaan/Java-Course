package com.systemerr.javacourse.arraychallenge;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(0);
        int[] arrayAscending = {0, 0, 0, 0, 0};
            
        for (int i = 0; i < arrayAscending.length; i++) {
            arrayAscending[i] = random.nextInt(1, 100);
        }
        Arrays.sort(arrayAscending);
        int[] arrayDescending = arrayAscending.clone();
        for (int i = 0; i < arrayAscending.length; i++) {
            arrayDescending[i] = arrayAscending[arrayAscending.length - i - 1];
        }
        System.out.println(Arrays.toString(arrayDescending));
    }
}
