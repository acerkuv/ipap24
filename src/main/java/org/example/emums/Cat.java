package org.example.emums;

public class Cat {
    public String name;
    public String color;
    private Seasons seasons;


    public Cat(String name, String color){
        this.name = name;
        this.color = color;

    }
    public void setSession(Seasons seasons){
        this.seasons = seasons;
        switch (this.seasons) {
            case AUTUMN-> System.out.println("линяю");
            case SPRING -> System.out.println("love");
            case SUMMER -> System.out.println("run");
            case WINTER -> System.out.println("sleep");
            default -> System.out.println("Wow!");

            }
        }
    }



