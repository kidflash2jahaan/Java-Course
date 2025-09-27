package com.systemerr.javacourse.sum3and5challenge;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) numbers.add(i);
            if (numbers.size() == 5) break;
        }

        int[] sum = {0};
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
                sum[0] += i;
            }
        });
        System.out.println(sum[0]);
    }
}
