package designpatterns.creational.factorymethod.example.gof;

import designpatterns.creational.factorymethod.pattern.Product;

public interface Document extends Product {
    void open();
    void close();
    void save();
    void revert();
}
