package org.example.arraylists;

public class Dog extends Cat{
    public Dog(String name) {
        super(name);
    }
    @Override
    public String run(){;
        return "Я " + this.name + ", бегаю виляя хвостом!";
    }
}
