package org.example.abstractclas;

public class Main {
    public static void main(String[] args) {
        Squirel squirel = new Squirel();
        squirel.setName("Lucy");
        System.out.println("Я белка " + squirel.getName());
        squirel.run();

        Mole mole = new Mole();
        squirel.setName("Tom");
        System.out.println("Я крот " + mole.getName());
        mole.run();
    }
}
