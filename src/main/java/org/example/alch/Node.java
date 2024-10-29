package org.example.alch;

import java.util.Objects;

public class Node {
    String result;
    Node inputL;
    Node inputR;
    public Node(String result, Node inputL, Node inputR){
        this.result = result;
        this.inputL = inputL;
        this.inputR = inputR;
    }

    @Override
    public String toString() {
        String l = (Objects.isNull(inputL))? "null": inputL.toString();
        String r = (Objects.isNull(inputR))? "null": inputR.toString();

        return "Node{" +
                "result='" + result + '\'' +
                ", inputL=" + l +
                ", inputR=" + r +
                '}';
    }

    public Node(String result, Node inputL){
        this.result = result;
        this.inputL = inputL;
    }
    public Node(String result){
        this.result = result;
    }


    public void setInputL(Node inputL) {
        this.inputL = inputL;
    }

    public void setInputR(Node inputR) {
        this.inputR = inputR;
    }

    public String getResult() {
        return result;
    }

    public Node getInputL() {
        return inputL;
    }

    public Node getInputR() {
        return inputR;
    }

    public int qtySteps(String string){
        int qtySt = 1;
        if (result.equals(string))return qtySt;
        Node current = inputL;
        while (true){
            if (current.getResult().equals(string)) {
                qtySt++;
                break;
            }else{
                current = inputR;
                if(current.getResult().equals(string)) {
                    qtySt++;
                    break;
                }else{
                    current = current.inputL;
                }

            }
        }

        return qtySt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(result, node.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }
}
