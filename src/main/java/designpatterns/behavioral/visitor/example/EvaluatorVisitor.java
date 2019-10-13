package designpatterns.behavioral.visitor.example;

public class EvaluatorVisitor implements Visitor {
    @Override
    public void visit(OpNode opNode) {
        System.out.println("opnode visited");
    }

    @Override
    public void visit(VarNode varNode) {
        System.out.println("varnode visited");
    }

    public static void main(String[] args) {
        Visitor evaluatorVisitor = new EvaluatorVisitor();
        OpNode opNode = new OpNode();
        opNode.accept(evaluatorVisitor);


    }
}
