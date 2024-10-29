package org.example.treemap;

public class Node {
    String name;
    Integer seat;
    Node left;
    Node right;

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node(String name) {
        this.name = name;
    }
}
