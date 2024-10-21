package org.example.courses;

import java.util.*;

abstract class Diary {
    String name;
    public  Set<Courses>  courses;
    public Map<Courses, ArrayList<Integer>> diary = new HashMap<>();
    public abstract void addCost(Courses courses, int cost);
    public abstract List<Integer> getCourseCosts(Courses courses);
    public abstract float getMedianCosts(Courses courses);


    public abstract boolean addCourse(Courses course);

    public abstract void addCourses(List<Courses> list);

}
