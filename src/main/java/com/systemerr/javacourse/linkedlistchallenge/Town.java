package com.systemerr.javacourse.linkedlistchallenge;

public class Town {
    private String town;
    private int distanceFromSydney;

    public Town(String town, int distanceFromSydney) {
        this.town = town;
        this.distanceFromSydney = distanceFromSydney;
    }

    public String getTown() {
        return this.town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getDistanceFromSydney() {
        return this.distanceFromSydney;
    }

    public void setDistanceFromSydney(int distanceFromSydney) {
        this.distanceFromSydney = distanceFromSydney;
    }

    @Override
    public String toString() {
        return town + " - " + distanceFromSydney;
    }
}
