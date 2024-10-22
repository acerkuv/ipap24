package org.example.school;

import java.util.*;

@SuppressWarnings("ClassEscapesDefinedScope")
public class Learner extends Grade{
    private String name;
    private Grade grade;
    private final List<Integer> costs = new ArrayList<>();
    private final Map<Courses, List<Integer>> diary = new HashMap<>();

    public Learner(String name){
        this.name = name;


    }
    @Override
    public void setGradeName(String gradeName){
        this.gradeName = gradeName;
    }

    @Override
    void addCourses(List<Courses> list) {
        this.listCourses = list;
    }
    @Override
    List<Courses> getListCourses() {
        return new ArrayList<>(listCourses);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    public void addCost(Courses course, int cost){


    }
//    public ArrayList getCosts(Courses course){
//
//    }
    public String readDiary(){
        String allDiary = "Оценки по курсам: ";
        for (Courses c: this.listCourses){
            allDiary += c;
            if(diary.get(c)!=null) {
                for (int i : diary.get(c)) {
                    allDiary += i + ", ";
                }
            }
        }
        return allDiary;
    }
}
