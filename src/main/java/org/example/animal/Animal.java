package org.example.animal;

public abstract class Animal {
    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  String toString(){
        return "Меня зовут " + getName() + " мне " + getAge() + " лет";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
