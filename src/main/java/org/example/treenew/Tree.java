package org.example.treenew;

import java.util.Objects;

public class Tree {
    Node rootNode;

    public Tree() {
        rootNode = null;
    }

    public void addToTree(String name) {
        int qry = 5;
        Node newNode = new Node(name);
        if (rootNode == null) {
            rootNode = newNode;
        } else {
            Node currentNode = rootNode;
            while (true) {
//            get left node first
                if (Objects.isNull(currentNode.getLeftNode())) {
                    currentNode.setLeftNode(newNode);

                    return;

//               get gight second
                } else if (Objects.isNull(currentNode.getRightNode())) {
                    currentNode.setRightNode(newNode);

                    return;
                } else if (Objects.nonNull(currentNode.getRightNode()) && Objects.nonNull(currentNode.getRightNode())) {
                    currentNode = currentNode.getLeftNode();

                }
            }

        }

    }


    public Node getRootNode() {
        return rootNode;
    }

}






