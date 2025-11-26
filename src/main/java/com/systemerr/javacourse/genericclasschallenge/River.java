package com.systemerr.javacourse.genericclasschallenge;

public class River extends Line {
    private final String name;

    public River(String name, double[][] points) {
        super(points);
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
