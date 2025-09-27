package com.systemerr.javacourse.firstmethodchallenge;

public class Main {
    public static void main(String[] args) {
        displayHighScorePosition("P1", calculateHighScorePosition(1500));
        displayHighScorePosition("P2", calculateHighScorePosition(1000));
        displayHighScorePosition("P3", calculateHighScorePosition(500));
        displayHighScorePosition("P4", calculateHighScorePosition(100));
        displayHighScorePosition("P5", calculateHighScorePosition(25));
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 100) {
            if (score >= 500) {
                if (score >= 1000) {
                    return 1;
                }
                return 2;
            }
            return 3;
        }
        return 4;
    }
}
