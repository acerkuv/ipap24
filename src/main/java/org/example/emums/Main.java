package org.example.emums;

public class Main {
    public static void main(String[] args) {
        Cat cat =new Cat("Koko", "orange");
        cat.setSession(Seasons.WINTER);
        cat.setSession(Seasons.SPRING);


        //Cтудент
        Student student = new Student("Tomas");
        student.addCost((short) 3);
        student.addCost((short) 5);
        student.addCost((short) 4);

        System.out.println("Все оценки " + student.getAllCosts());
        System.out.println("Средний балл " + student.getMidCost());


    }
}
