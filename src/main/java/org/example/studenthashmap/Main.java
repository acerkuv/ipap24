package org.example.studenthashmap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Disciplines, Map<Student, List <Short>>> diary = new HashMap<>();

//        Student maximilian = new Student("Maximilian");
        Set<Disciplines> d = new HashSet<>(Arrays.asList(Disciplines.MATHEMATICS));
        Student maximilian = new Student("Maximilian", d);
        maximilian.addNewDiscipline(Disciplines.MATHEMATICS);

    }
}
