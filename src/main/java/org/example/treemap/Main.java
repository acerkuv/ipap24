package org.example.treemap;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Node[] nodes = {
                new Node("A"), new Node("B"), new Node("C")
        };
        TreeMap<Integer, Node> treeMap = new TreeMap<>();
        int i = 0;
        for (Node n: nodes) {
            treeMap.put(i++, n);
        }

        System.out.println(treeMap.get(1));

    }



}
