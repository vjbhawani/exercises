package designpatterns.behavioral.strategy.example.gof;

import designpatterns.behavioral.strategy.structure.Strategy;

public interface Compositor extends Strategy {
    int compose();
}
