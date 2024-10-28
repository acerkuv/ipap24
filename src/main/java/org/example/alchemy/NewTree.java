package org.example.alchemy;

import java.util.Objects;
import java.util.Stack;

public class NewTree {
    private Node rootNode;
        public NewTree(){
        rootNode = null;
    }

    public void insertNode(String value){
            Node newNode = new Node(value);
        if (rootNode == null) { // если корневой узел не существует
            rootNode = newNode;// то новый элемент и есть корневой узел
        }
        Node currentNode = rootNode; // начинаем с корневого узла
        Node parentNode;
        while (true){
            if(Objects.isNull(currentNode.getLeftChild())){
                currentNode.setLeftChild(newNode);
                return;
            }
            else if(Objects.isNull(currentNode.getRightChild())){
                currentNode.setRightChild(newNode);
                return;
            }
            else{
                return;
            }
        }
    }
    public void printTree(){

    }
}
