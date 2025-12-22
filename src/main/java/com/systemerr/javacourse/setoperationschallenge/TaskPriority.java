package com.systemerr.javacourse.setoperationschallenge;

public enum TaskPriority {
    HIGH, MEDIUM, LOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
