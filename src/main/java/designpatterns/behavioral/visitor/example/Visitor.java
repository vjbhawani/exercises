package designpatterns.behavioral.visitor.example;

public interface Visitor {
    void visit(OpNode opNode);
    void visit(VarNode varNode);
}
