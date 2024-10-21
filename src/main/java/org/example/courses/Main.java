package org.example.courses;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//Студент Томас
        Student tomas = new Student("Tomas");
//        Добавляем курсы
        tomas.addCourse(Courses.MATHEMATICS);
        tomas.addCourse(Courses.LITERATURE);
// добавляем курсы списком
        List<Courses> tomasCourses = Arrays.asList(Courses.LITERATURE, Courses.ATHLETICS);
        tomas.addCourses(tomasCourses);

        System.out.println("\nВсе курсы студента " + tomas.getName() + " :");
        Set<Courses> allTomasCourses = tomas.getMyCourses();
        for (Courses c: allTomasCourses) System.out.println(c);

//        Добавляем оценки
        tomas.addCost(Courses.MATHEMATICS, 5);
        tomas.addCost(Courses.MATHEMATICS, 4);
//
//       Какие оценки в дневнике по математике
        System.out.println("\nОценки по математике "  + tomas.getCourseCosts(Courses.MATHEMATICS));

//        Средняя оценка по матиматике
        System.out.println("\nСредняя оценка по матиматике " +  tomas.getMedianCosts(Courses.MATHEMATICS));





    }
}
