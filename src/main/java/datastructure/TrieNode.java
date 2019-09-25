package datastructure;

import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.AbstractEdge;
import org.graphstream.graph.implementations.AbstractGraph;
import org.graphstream.graph.implementations.AbstractNode;

import java.util.*;

class TrieNode {
    private Map<Character, TrieNode> map = new HashMap<>();
    private boolean isEndOfWord = false;

    public Map<Character, TrieNode> getMap() {
        return map;
    }

    public boolean isEndOfWord() {
        return isEndOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        isEndOfWord = endOfWord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrieNode trieNode = (TrieNode) o;
        return isEndOfWord == trieNode.isEndOfWord &&
                Objects.equals(map, trieNode.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map, isEndOfWord);
    }

}
