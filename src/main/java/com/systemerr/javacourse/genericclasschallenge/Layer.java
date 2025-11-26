package com.systemerr.javacourse.genericclasschallenge;

import java.util.List;
import java.util.function.Consumer;

public class Layer<T extends Mappable> {
    private final List<T> elements;

    public Layer(List<T> elements) {
        this.elements = elements;
    }

    public void renderLayer() {
        elements.forEach(new Consumer<T>() {
            @Override
            public void accept(T t) {
                System.out.println(t.render());
            }
        });
    }
}
