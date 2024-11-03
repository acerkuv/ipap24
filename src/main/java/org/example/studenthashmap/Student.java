package org.example.studenthashmap;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student {
//    Выбор дисциплин студента
    public Set<Disciplines> personal = new HashSet<>();
    private String name;
    public Student(String name) {
        this.name = name;
    }
    public Student(String name, Set<Disciplines> disciplines) {
        this.name = name;
        this.personal = disciplines;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean addNewDiscipline(Disciplines d){
        if (personal.add(d)) return true;
        System.out.println("Такая дисциплина уже есть");
        return false;
    }


}
