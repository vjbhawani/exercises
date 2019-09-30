package designpatterns.creational.factorymethod.example.gof;

public class MyDocument implements Document {
    @Override
    public void open() {
        System.out.println("document open");

    }

    @Override
    public void close() {
        System.out.println("document close");
    }

    @Override
    public void save() {
        System.out.println("document save");
    }

    @Override
    public void revert() {
        System.out.println("document revert");
    }
}
