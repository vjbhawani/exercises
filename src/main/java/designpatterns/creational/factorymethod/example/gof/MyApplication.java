package designpatterns.creational.factorymethod.example.gof;

import designpatterns.creational.factorymethod.pattern.Product;

public class MyApplication extends Application {
    @Override
    protected Product factoryMethod() {
        return new MyDocument();
    }
}
