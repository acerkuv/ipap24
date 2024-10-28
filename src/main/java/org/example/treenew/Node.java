package org.example.treenew;

import java.util.Objects;

public class Node {
    private String name;
    Node leftNode;
    Node rightNode;
    public Node(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        String leftNodeStr = Objects.isNull(leftNode)? "null":leftNode.getName();
        String rightNodeStr = Objects.isNull(rightNode)? "null": rightNode.getName();
        String nodeSrt ="{ Node name: " + name;
        nodeSrt += "\n Left = " + leftNodeStr +
                ", Right = " + rightNodeStr + "} ";
        return nodeSrt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(name, node.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
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
