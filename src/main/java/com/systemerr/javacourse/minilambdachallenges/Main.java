package com.systemerr.javacourse.minilambdachallenges;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static Consumer<String> printTheParts = sentence -> {
        String[] parts = sentence.split(" ");
        for (String part : parts) {
            System.out.println(part);
        }
    };

    public static Function<String, String> everySecondChar = source -> {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    };

    public static Supplier<String> iLoveJava = () -> "I love Java";

    public static String supplierResult = iLoveJava.get();

    public static String everySecondCharacter(Function<String, String> function, String source) {
        return function.apply(source);
    }

    public static void main(String[] args) {
        System.out.println(everySecondChar.apply("1234567890"));
        System.out.println(everySecondCharacter(everySecondChar, "1234567890"));
        System.out.println(supplierResult);
    }
}
