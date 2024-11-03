package org.example.tree;


import java.util.Map;

//https://acmp.ru/index.asp?main=task&id_task=743
//alchemy.txt
public class Main {
    public static void main(String[] args) {

        ReadFile readFile = new ReadFile();
        readFile.readFile();
        Map<String, Integer> sortedReactions = readFile.reactions;

        for (String i: readFile.reactions.keySet())
            System.out.println(readFile.reactions.get(i));

        Tree tree = new Tree();
        tree.addNode("A");
//        System.out.println( tree.rootNode.name + " " + tree.rootNode.getRightNodeName());

        tree.addNode("B");

        tree.addNode("C");


        tree.addNode("D");

        tree.addNode("E");
        tree.addNode("F");
        tree.addNode("G");
        tree.addNode("H");
        tree.addNode("J");
        tree.addNode("X");
        tree.addNode("P");


        System.out.println("Steps " +  tree.qtyStepsTo("P"));
//        System.out.println(tree.readTree());
//        System.out.println(tree.readTree());

        }
}
