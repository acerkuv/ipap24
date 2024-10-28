package org.example.treenew;

public class Main {
    public static void main(String[] args) {

        Tree t = new Tree();

        t.addToTree("a");
        t.addToTree("b");
        t.addToTree("c");
        t.addToTree("d");
        t.addToTree("e");
        t.addToTree("f");
        t.addToTree("g");
        t.addToTree("h");

        Node f = t.findNodeIntoTree("b");
        System.out.println(f.toString());

    }
}
