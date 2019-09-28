package designpatterns.behavioral.strategy.problems.problem_gof.solution_strategy;

import designpatterns.behavioral.strategy.pattern.Context;

public class Composition implements Context {
    private final Compositor compositor;

    public Composition(Compositor compositor) {
        this.compositor = compositor;
    }

    public void repair() {
        this.compositor.compose();
    }
}
