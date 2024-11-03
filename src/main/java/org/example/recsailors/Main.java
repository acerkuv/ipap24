package org.example.recsailors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> weight = new ArrayList<>(Arrays.asList(50, 120, 74, 60, 100, 82));
        List<Integer> sortedWeight = weight.stream().sorted().toList();

        int[][] ships = new int[5][2];
        takeSiatsFromSailors(sortedWeight, 135);

    }

    public static List<Integer> takeSiatsFromSailors(List<Integer> sortedWeight, int maxShipCargo) {

        if (sortedWeight.size() == 2) {
            System.out.println("End");

        }
        else {
            boolean b = sortedWeight.get(0) + sortedWeight.get(sortedWeight.size() - 1) <= maxShipCargo;
            if (b) {
                System.out.println(sortedWeight.get(0) + sortedWeight.get(sortedWeight.size() - 1));
                sortedWeight.remove(0);
                sortedWeight.remove(sortedWeight.size() - 1);
            } else {
                System.out.println(sortedWeight.get(sortedWeight.size() - 1));
                try {
                    sortedWeight.remove(sortedWeight.size()-1);

                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
        return takeSiatsFromSailors(sortedWeight, maxShipCargo);
    }
}





