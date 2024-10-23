package org.example.searchengine2;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        HashSet<Site> searchEngineBase =new HashSet<>(List.of(new Site("google")));
//        System.out.println(searchEngineBase.isEmpty());

        Site nerc = new Site("nerc.org");
        System.out.println(nerc.addKeyWord("hello"));
//        System.out.println(nerc.removeKeyWord("hello"));
        nerc.addKeyWord("sport");
        System.out.println(nerc.findKeyWord("hello"));

        System.out.println( nerc.getKeyWordsList());
        System.out.println(nerc.findKeyWord("sport"));


    }
}
