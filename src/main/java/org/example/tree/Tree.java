package org.example.tree;

import java.util.Objects;

public class Tree {
    Node rootNode;
    public Tree(){
        rootNode = null;
    }
    public void addNode(String name){
        if (rootNode == null){
            rootNode = new Node(name);
            return;
        }
        Node currentNode;
        currentNode = rootNode;
        while (true){
//           all nodes are null
            if(Objects.nonNull(currentNode.getRight()) && Objects.nonNull(currentNode.getLeft())){
                Node rightNode = currentNode.getRight();
                currentNode = rightNode;
            }
//            isRightNode?
            else if
            (Objects.isNull(currentNode.getRight())){
                currentNode.setRight(name);
                break;
//             isLeftNode?
            } else if (Objects.isNull(currentNode.getLeft())) {
                currentNode.setLeft(name);
                break;
            }
        }
    }

    public Node getRootNode() {
        return rootNode;
    }
    public int qtyStepsTo(String name) {
        int qtySreps = 0;
        Node currentNode = rootNode;
        Node temp = new Node(name);
//        Go to right side
        boolean sides = true;

        while (true) {
                if(Objects.nonNull(currentNode.getRight())) {
                    if (currentNode.getRight().equals(temp)) {
                        break;
                    } else if (Objects.nonNull(currentNode.getRight())) {
                        currentNode = currentNode.getRight();
                        qtySreps++;
                    }
                }
                else break;
            }
//                    go to the left side
        qtySreps = 0;
        while (true) {
            if(Objects.nonNull(currentNode.getLeft())) {
                if (currentNode.getLeft().equals(temp)) {
                    break;
                } else if (Objects.nonNull(currentNode.getLeft())) {
                    currentNode = currentNode.getLeft();
                    qtySreps++;
                }
            }
            else break;
        }


        return qtySreps;
    }
    public String readTree () {
            String curNode = rootNode.nodeToString();
            Node currentNode = rootNode;

            while (currentNode.getLeftNodeName() != currentNode.getRightNodeName()) {
                curNode += currentNode.getRight().nodeToString();
                curNode += currentNode.getLeft().nodeToString();
                currentNode = currentNode.getRight();
            }
            return curNode;
        }

    }

