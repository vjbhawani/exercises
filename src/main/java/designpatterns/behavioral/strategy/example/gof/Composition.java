package designpatterns.behavioral.strategy.example.gof;

import designpatterns.behavioral.strategy.structure.Context;

public class Composition implements Context {
    private final Compositor compositor;

    public Composition(Compositor compositor) {
        this.compositor = compositor;
    }

    public void repair() {
        this.compositor.compose();
    }
}
