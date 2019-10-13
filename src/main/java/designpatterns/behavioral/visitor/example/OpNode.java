package designpatterns.behavioral.visitor.example;

public class OpNode implements Node {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
