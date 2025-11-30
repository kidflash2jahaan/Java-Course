package com.systemerr.javacourse.lambdaexpressionchallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Anna", "Bob", "Charlie", "Denny", "Eugene", "Francisco", "Geraldo"};

        Arrays.setAll(names, i -> names[i].toUpperCase());
        List.of(names).forEach(name -> System.out.println(name));
        System.out.println("-".repeat(10));

        Arrays.setAll(names, i -> names[i] += " " + (char) (new Random().nextInt(26) + 'A') + ". ");
        List.of(names).forEach(name -> System.out.println(name));
        System.out.println("-".repeat(10));

        Arrays.setAll(names, i -> names[i] += new StringBuilder(names[i].substring(0, names[i].length() - 4)).reverse());
        List.of(names).forEach(name -> System.out.println(name));
        System.out.println("-".repeat(10));

        ArrayList<String> arrayList = new ArrayList<>(List.of(names));
        arrayList.removeIf(name -> name.split(" ")[0].contains(name.split(" ")[2]));
        arrayList.forEach(name -> System.out.println(name));
    }
}
