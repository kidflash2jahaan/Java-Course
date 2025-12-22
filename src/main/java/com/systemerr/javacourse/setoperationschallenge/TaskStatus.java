package com.systemerr.javacourse.setoperationschallenge;

public enum TaskStatus {
    INPROGRESS, INQUEUE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
