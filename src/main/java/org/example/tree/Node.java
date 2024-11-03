package org.example.tree;

import java.util.Objects;

public class Node {
    String name;
    Node left;
    Node right;
    public Node(String name){
        this.name = name;
    }

    public void setLeft(String name) {
        this.left = new Node(name);
    }

    public void setRight(String name) {
        this.right = new Node(name);
    }
    public Node getLeft(){
        if (Objects.nonNull(left)) return left;
        return null;
    }
    public Node getRight(){
        if (Objects.nonNull(right)) return right;
        return null;
    }
    public String getName(){
        return  this.name;
    }
    public String toString(){
        return getName();
    }
    public String getRightNodeName(){
        Node right = getRight();
        if(Objects.nonNull(right))return right.getName();
        return null;
    }
    public String getLeftNodeName(){
        Node left = getLeft();
        if(Objects.nonNull(right))return left.getName();
        return null;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Node node = (Node) object;
        return Objects.equals(name, node.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    public String nodeToString(){
        String leftNodeString = getRightNodeName();
        return "Node { " + name + ":\n"
              + " left "  + getRightNodeName() +
              ", right "  + getRightNodeName() +"}, ";

    }
}
