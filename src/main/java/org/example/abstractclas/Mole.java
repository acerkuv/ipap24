package org.example.abstractclas;

public class Mole extends Animal{
    private String name;
    @Override
    public void run() {
        System.out.println("I'm digging!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
