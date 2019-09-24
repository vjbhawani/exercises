package algorithm;

import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

import java.util.*;

/**
 * Given an acyclic directed graph, return list of Nodes in an order such that, for each edge uv, where direction is from u to v, u comes before v in the list.
 *
 * application: finding package system, so that independent package can be compiled
 */
public class TopologicalSort {
    public static void main(String[] args) {
        Graph graph = new SingleGraph("Tutorial 1");
        graph.setStrict(false);
        graph.setAutoCreate( true );
        graph.addEdge( "AC", "A", "C",true );
        graph.addEdge( "BC", "B", "C" , true);
        graph.addEdge( "BD", "B", "D" , true);
        graph.addEdge( "CE", "C", "E" , true);
        graph.addEdge( "EH", "E", "H" , true);
        graph.addEdge( "EF", "E", "F" , true);
        graph.addEdge( "DF", "D", "F" , true);
        graph.addEdge( "FG", "F", "G" , true);

        for (Node node : graph) {
            node.addAttribute("ui.label", node.getId());
        }
        graph.display(true);

        List<Node> nodes = topologicalSort(graph);
        for (Node node : nodes) {
            System.out.println(node.getId());
        }

        System.exit(0);
    }

    private static List<Node> topologicalSort(Graph graph) {

        Set<Node> visitedNode = new HashSet<>();
        Stack<Node> stack = new Stack<>();

        for (Node node : graph) {
            if(!visitedNode.contains(node)) {
                visit(node, visitedNode, stack);
            }
        }

        List<Node> result = new ArrayList<>();
        while (!stack.empty()) {
            result.add(stack.pop());
        }

        return result;
    }

    private static void visit(Node node, Set<Node> visitedNode, Stack<Node> stack) {
        visitedNode.add(node);
        for (Edge edge : node.getEachLeavingEdge()) {
            Node targetNode = edge.getTargetNode();
            if(!visitedNode.contains(targetNode)) {
                visit(targetNode, visitedNode, stack);
            }
        }
        stack.add(node);
    }
}
