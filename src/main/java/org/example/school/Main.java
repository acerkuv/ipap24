package org.example.school;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Learner tomas = new Learner("Tomas");
        tomas.setGradeName("beginner");

        tomas.addCourses(new ArrayList<>(Arrays.asList(Courses.MATHEMATICS, Courses.PHILOSOPHY)));
        System.out.println(tomas.getListCourses());

        tomas.addCost(Courses.MATHEMATICS, 5);
        tomas.addCost(Courses.MATHEMATICS, 4);

//        System.out.println(  tomas.readDiary());

    }
}
