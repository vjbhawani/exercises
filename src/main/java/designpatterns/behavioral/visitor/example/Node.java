package designpatterns.behavioral.visitor.example;

public interface Node {
    void accept(Visitor visitor);
}
