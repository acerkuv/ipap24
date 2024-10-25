package org.example.alchemy;


class Node {
    private String value; // ключ узла
    private Node leftChild; // Левый узел потомок
    private Node rightChild; // Правый узел потомок
    public void printNode() { // Вывод значения узла в консоль
        System.out.println(" Выбранный узел имеет значение :" + value);
    }
    Node(String value){
        this.value = value;
    }

    Node(final String value, Node leftChild, Node rightChild) {
        this.value = value;
        this.rightChild =rightChild;
        this.leftChild = leftChild;
    }
    public Node[] getChild() {
        return new Node[] {this.leftChild, this.rightChild };
    }

    public String getLeftChildValue() {
        return leftChild.value;
    }

    public void  setValue(String value){
        this.value = value;
    }
    public String getValue(){
         return  this.value;
    }
    public void setLeftChild(final Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }
    public Node getLeftChild() {
        return this.leftChild;
    }

    public void setRightChild(final Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}
