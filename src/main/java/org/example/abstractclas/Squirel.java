package org.example.abstractclas;

public class Squirel extends Animal{
    @Override
    public void run() {
        System.out.println("I'm running!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
