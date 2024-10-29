package org.example.alch;

public class Main {
    public static void main(String[] args) {
        Node node = new Node("Aurum",

                new Node("Argentum", new Node("AquaVita", new Node("Aqua"))),

                new Node("AquaVita"));

        System.out.println(node.qtySteps("AquaVita"));
    }


}
