package designpatterns.creational.abstractfactory.example.my;

public class FordFactory implements CarFactory {
    @Override
    public Wheel createWheel() {
        return new FordWheel();
    }

    @Override
    public Tyre creatTyre() {
        return new FordTyre();
    }
}
