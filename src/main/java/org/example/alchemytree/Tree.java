package org.example.alchemytree;

public class Tree {
    Node rootNode;
    public Tree(){
        this.rootNode = null;
    }

    public void addNode(Node node){
//
        int qtyCycle = 0;
        if(rootNode==null){
            rootNode = node;
        }else{
            Node currentNode = node;
            while (true){
                if(rootNode.leftNode == null) {
                    rootNode.rightNode = currentNode;
                    return;
                }
                else if (rootNode.rightNode == null) {
                    rootNode.leftNode = currentNode;
                    return;
                }
                else{
                    if (rootNode.leftNode.leftNode==null) {
                        rootNode.leftNode.setLeftNode(currentNode);
                        return;
                    }
                    else if(rootNode.leftNode.rightNode==null){
                        rootNode.leftNode.setRightNode(currentNode);
                        return;
                    }
                }

            }
        }
    }
    @Override
    public String toString(){
        return rootNode.toString();
    }
    public int getWayFromTree(Node node) {
        int qtySteps = 0;
        int goSide = 1;
        if (rootNode.equals(node)) return qtySteps;
        Node currentNode = rootNode;
        while (true) {
            qtySteps++;
            if (currentNode.equals(node)) return qtySteps;
            if (currentNode.leftNode.equals(node) || currentNode.rightNode.equals(node)) {
                break;
            } else if (goSide > 0) {
                currentNode = currentNode.leftNode;
                goSide--;
            } else if (goSide == 0) {
                currentNode = currentNode.rightNode;
                qtySteps++;
                goSide++;
            }
        }
        return qtySteps;
    }


}
