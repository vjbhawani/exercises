package designpatterns.behavioral.visitor.example;

public class VarNode implements Node {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
