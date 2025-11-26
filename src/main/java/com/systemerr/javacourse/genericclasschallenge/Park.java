package com.systemerr.javacourse.genericclasschallenge;

public class Park extends Point {
    private final String name;

    public Park(String name, double[] point) {
        super(point);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String render() {
        return name + super.render();
    }
}
