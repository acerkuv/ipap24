package org.example.alchemytree;

import java.util.Objects;

public class Node {
    String name;
    Node leftNode;
    Node rightNode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(name, node.name) && Objects.equals(leftNode, node.leftNode) && Objects.equals(rightNode, node.rightNode);
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, leftNode, rightNode);
    }

    public Node(String name, Node leftNode, Node rightNode) {
        this.name = name;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
    public Node(String name){
        this.name = name;
    }
    public Node(Node node){
        this.name = node.getName();
        this.leftNode = node.getLeftNode();
        this.rightNode = node.getRightNode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }
}
