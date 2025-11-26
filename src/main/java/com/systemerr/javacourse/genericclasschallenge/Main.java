package com.systemerr.javacourse.genericclasschallenge;

import java.util.ArrayList;
import java.util.List;

public class Main {
     public static void main(String[] args) {
        Park park = new Park("Grand Canyon National Park", new double[]{40.1021, -75.4231});
        River river = new River("Mississipi River", new double[][]{{47.216, -95.2348}, {29.1566, -89.2495}, {35.1556, -90.0659}});
        Layer layer = new Layer<Mappable>(List.of(park, river));
        layer.renderLayer();
     }
}
