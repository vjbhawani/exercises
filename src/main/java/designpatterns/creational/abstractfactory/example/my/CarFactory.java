package designpatterns.creational.abstractfactory.example.my;

import designpatterns.creational.abstractfactory.pattern.AbstractFactory;

public interface CarFactory extends AbstractFactory {
    Wheel createWheel();
    Tyre creatTyre();
}
