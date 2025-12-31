package com.systemerr.javacourse.streamschallenge;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> streamB = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15).map(integer -> "B" + integer);
        Stream<String> streamI = Stream.iterate(16, seed -> seed <= 30, seed -> seed + 1).map(integer -> "I" + integer);
        Stream<String> streamN = Stream.iterate(31, seed -> seed + 1).limit(15).map(integer -> "N" + integer);
        Stream<String> streamG = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}).boxed().map(i -> i += 45).map(integer -> "G" + integer);
        Stream<String> streamO = IntStream.range(61, 75).boxed().map(integer -> "O" + integer);
        Stream.concat(streamB, Stream.concat(streamI, Stream.concat(streamN, Stream.concat(streamG, streamO)))).forEach(System.out::println);
    }
}
