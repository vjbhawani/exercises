package designpatterns.creational.abstractfactory.example.my;

public class TeslaFactory implements CarFactory {
    @Override
    public Wheel createWheel() {
        return new TeslaWheel();
    }

    @Override
    public Tyre creatTyre() {
        return new TeslaTyre();
    }
}
