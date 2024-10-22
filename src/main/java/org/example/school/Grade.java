package org.example.school;


import java.util.List;

abstract class Grade {
    String gradeName;
    List<Courses> listCourses;
    abstract void addCourses(List<Courses> list);
    abstract List<Courses> getListCourses();

    abstract void setGradeName(String gradeName);
}
