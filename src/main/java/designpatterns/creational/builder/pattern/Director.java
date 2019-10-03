package designpatterns.creational.builder.pattern;

public class Director {
    public ProductA buildProductA(Builder builder) {
        ProductA productA = null;
        return productA;
    }

    public ProductA buildProductAOfDifferentVariation(Builder builder) {
        ProductA productAOfDifferentVariation = null;
        return productAOfDifferentVariation;
    }

    public ProductB buildProductB(Builder builder) {
        ProductB productB = null;
        return productB;
    }
}
