package org.example.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Hello world!"));
        t.start();
//
        List<Integer> prim = new ArrayList<>();
        prim.add(1);
        prim.add(3);

        System.out.println(prim.contains(1));


        }

}
