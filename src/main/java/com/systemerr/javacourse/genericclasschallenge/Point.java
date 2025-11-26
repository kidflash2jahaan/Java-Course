package com.systemerr.javacourse.genericclasschallenge;

import java.util.Arrays;

public class Point implements Mappable {
    private final double[] point;

    public Point(double[] point) {
        this.point = point;
    }

    public double[] getPoint() {
        return this.point;
    }

    @Override
    public String render() {
        return " POINT " + Arrays.toString(point);
    }
}
