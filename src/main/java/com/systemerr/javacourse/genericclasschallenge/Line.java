package com.systemerr.javacourse.genericclasschallenge;

import java.util.Arrays;

public class Line implements Mappable {
    private final double[][] points;

    public Line(double[][] points) {
        this.points = points;
    }

    public double[][] getPoints() {
        return this.points;
    }

    @Override
    public String render() {
        return " LINE " + Arrays.deepToString(points);
    }
}
