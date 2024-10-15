package org.example.arraylists;

public class Cat implements Runable{
    public String name;
    public Cat(String name){
        this.name = name;
    }
    @Override
    public String run() {;
        return "Я " + this.name + ", бегаю с поднятым хвостом!";
    }

}
