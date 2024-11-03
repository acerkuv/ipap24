package org.example.emums;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    List<Short> allCosts = new ArrayList<>();
    public Student(String name){
        this.name = name;
    }
    public void addCost(short cost){
        allCosts.add(cost);
    }
   public String getAllCosts(){
        return allCosts.toString();
   }
    public float getMidCost(){
        int sumCosts = 0;
        for (short i: allCosts) sumCosts += i;
        return (float) sumCosts / allCosts.size();
    }
}
