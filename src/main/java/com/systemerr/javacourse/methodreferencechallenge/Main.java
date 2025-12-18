package com.systemerr.javacourse.methodreferencechallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("Anna", "Bob", "Charlie", "Denny", "Eugene", "Francisco", "Geraldo"));
        ArrayList<UnaryOperator<String>> functions = new ArrayList<>(List.of(
            String::toUpperCase,
            name -> name += " " + (char) (new Random().nextInt(26) + 'A') + ". ",
            name -> name += new StringBuilder(name.substring(0, name.length() - 4)).reverse()
        ));
        
        transform(names, functions);
        System.out.println(names);
    }

    public static void transform(ArrayList<String> names, ArrayList<UnaryOperator<String>> functions) {
        functions.forEach(names::replaceAll);
    }
}
