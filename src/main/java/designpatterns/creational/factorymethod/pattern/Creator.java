package designpatterns.creational.factorymethod.pattern;

public abstract class Creator {
    /*
    Define an interface (Creator) for creating an Object, but let subclasses decide which which class to instantiate.
    Factory Method lets a class defer(postpone) instantiation to subclasses.

    note: also known as virtual constructor
     */
    protected abstract Product factoryMethod();
}
