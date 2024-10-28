package org.example.alchemy;

import java.util.Arrays;
import java.util.TreeMap;

//https://acmp.ru/index.asp?main=task&id_task=743
//alchemy.txt
public class Main {
    public static void main(String[] args) {

//        Node node = new Node("Aurum", new Node("Argentum"),
//                new Node("AquaVita"));
        Node node = new Node("Aurum");
        Node node1 = new Node("Argentum");
        Node node2 = new Node("Aquavita");
        Node node3 = new Node("Water");

        node.setRightChild(node1);
        node.setLeftChild(node2);
        node2.setLeftChild(node3);



//        Tree tree = new Tree();
////        int t=  tree.countSteps(node3);
////        System.out.println(t);
//
//        Tree tree1 = new Tree();
//        tree1.insertNode("Aurum");
//        tree1.insertNode("Argentum");
//        tree1.insertNode("Silver");
//        tree1.insertNode("Ferum");
//
////        System.out.println(tree1.countSteps(new Node("Ferum")));
//
////        tree1.printTree();

        NewTree newTree = new NewTree();
        newTree.insertNode("Aurum");
        newTree.insertNode("Argentum");
        newTree.insertNode("Silver");
        newTree.insertNode("Ferum");
        newTree.insertNode("Oxygen");
        newTree.insertNode("Water");
        newTree.insertNode("Helium");

        System.out.println(newTree);







    }
}
