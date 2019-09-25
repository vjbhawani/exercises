package datastructure;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.graph.implementations.SingleGraph;

import java.util.*;
import java.util.stream.Collectors;

/**
 * application : prefixed search
 */
public class TrieDataStructure {
    public static void main(String[] args) {
        TrieNode trieNode = new TrieNode();

        addString("abc", trieNode);
        addString("abgl", trieNode);
        addString("cdf", trieNode);
        addString("abcd", trieNode);
        addString("lmn", trieNode);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            List<String> result = prefixSearch(s, trieNode);
            result.stream().forEach(System.out::println);
        }
    }

    private static List<String> prefixSearch(String s, TrieNode trieNode) {
        List<String> result = new ArrayList<>();

        if(s.isEmpty()) {
            for (Character k : trieNode.getMap().keySet()) {
                TrieNode v = trieNode.getMap().get(k);

                List<String> strings = prefixSearch(s, v);
                if (strings.isEmpty()) {
                    result.add(String.valueOf(k));
                } else {
                    strings.forEach(r -> result.add(k + r));
                    if (v.isEndOfWord()) {
                        result.add(String.valueOf(k));
                    }
                }
            }
        } else {
            char c = s.charAt(0);
            TrieNode trieNode1 = trieNode.getMap().get(c);
            if(trieNode1 == null) {
                return new ArrayList<>();
            } else {
                List<String> strings = prefixSearch(s.substring(1), trieNode1);
                if (strings.isEmpty()) {
                    result.add(String.valueOf(c));
                } else {
                    strings.forEach(r -> result.add(c + r));
                    if (s.length() == 1 && trieNode1.isEndOfWord()) {
                        result.add(String.valueOf(c));
                    }
                }
            }
        }

        return result;
    }

    private static void addString(String string, TrieNode trieNode) {
        if(string.isEmpty()) {
            trieNode.setEndOfWord(true);
        } else {

            char c = string.charAt(0);
            TrieNode trieNode1 = trieNode.getMap().get(c);

            if (trieNode1 == null) {
                TrieNode trieNode2 = new TrieNode();
                trieNode.getMap().put(c, trieNode2);
                addString(string.substring(1), trieNode2);
            } else {
                addString(string.substring(1), trieNode1);
            }
        }
    }


}
