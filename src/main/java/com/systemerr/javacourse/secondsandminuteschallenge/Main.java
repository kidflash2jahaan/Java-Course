package com.systemerr.javacourse.secondsandminuteschallenge;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(4025));
    }

    public static String getDurationString(int seconds) {
        int minutes = Math.floorDiv(seconds, 60);
        seconds = seconds - minutes * 60;
        return getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        int hours = Math.floorDiv(minutes, 60);
        minutes = minutes - hours * 60;
        return hours + "h " + minutes + "m " + seconds + "s";
    }
}
