package org.example.courses;

import java.util.*;

public class Student extends Diary {
    private String name;
    public Set<Courses> myCourses = new HashSet<>();
    public Map<Courses,List<Integer>> diary = new HashMap<>();

    public Student(String name){
        this.name = name;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addCost(Courses courses, int cost) {
        if(diary.get(courses)==null) {
            diary.put(courses, new ArrayList<>(Arrays.asList(cost)));
        }else{
            List temp = diary.get(courses);
            temp.add(cost);
            diary.put(courses, temp);
        }

    }

    @Override
    public List<Integer> getCourseCosts(Courses courses) {
        return this.diary.get(courses);
    }


    @Override
    public float getMedianCosts(Courses courses) {
        float median = 0;
        if(diary.get(courses)!= null) {
            List<Integer> medianCost = diary.get(courses);
            int sum = 0;
            for (int i: medianCost) sum += i;
            median = ((float)sum / (float) medianCost.size());
        }
        return median;
    }


    @Override
    public boolean addCourse(Courses course) {
        if (myCourses.add(course)) {
            System.out.println("Курс " + course +
                    " добавлен в список студенту " + name);
            return true;
        }
        else{
            System.out.println("Такой курс уже есть в списке");
            return false;
        }
    }

    @Override
    public  void addCourses(List<Courses> list) {
        for (Courses c:list) {
            if(!addCourse(c)) System.out.println("Курс " + c + " уже есть в списке!");
            else System.out.println(c + " добавлен!");
        }

    }
    public Set<Courses> getMyCourses(){
        return this.myCourses;
    }
}
