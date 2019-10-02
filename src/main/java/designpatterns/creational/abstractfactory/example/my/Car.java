package designpatterns.creational.abstractfactory.example.my;

public class Car {
    private Wheel wheel;
    private Tyre tyre;

    public Car(Wheel wheel, Tyre tyre) {
        this.wheel = wheel;
        this.tyre = tyre;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public static void main(String[] args) {
        CarFactory carFactory = new TeslaFactory();
        Car tesla = new Car(carFactory.createWheel(), carFactory.creatTyre());
        System.out.println(tesla.toString());


        carFactory = new FordFactory();
        Car ford = new Car(carFactory.createWheel(), carFactory.creatTyre());
        System.out.println(ford.toString());
    }

    @Override
    public String toString() {
        return wheel.toString() + " :: " + tyre.toString();
    }
}
