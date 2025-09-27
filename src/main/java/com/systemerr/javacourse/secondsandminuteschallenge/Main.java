package com.systemerr.javacourse.secondsandminuteschallenge;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(-1));
        System.out.println(getDurationString(1, 60));
        System.out.println(getDurationString(-1, 59));
        System.out.println(getDurationString(4025));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) return "seconds < 0";
        int minutes = Math.floorDiv(seconds, 60);
        seconds = seconds - minutes * 60;
        return getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (seconds < 0) return "seconds < 0";
        if (seconds > 59) return "seconds > 59";
        if (minutes < 0) return "minutes < 0";

        int hours = Math.floorDiv(minutes, 60);
        minutes = minutes - hours * 60;
        return hours + "h " + minutes + "m " + seconds + "s";
    }
}
