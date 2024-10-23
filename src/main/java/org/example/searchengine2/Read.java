package org.example.searchengine2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Read extends Site {

    HashSet<Site> searchEngineBase =new HashSet<>();

    public Read(String url) {
        super(url);
    }
    public Read(){}

    public void readFile() {
        File file = new File("input.txt");
        Charset charset = StandardCharsets.US_ASCII;
        try (BufferedReader reader = Files.newBufferedReader(file.toPath(), charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                fillSearchEngineBase(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }

    private void fillSearchEngineBase(String line) {
        String[] question = line.split(" ");
        String url = question[question.length-1];
        switch (question[0]) {
            case "Add" -> {
                String tKeyWord = question[2];
                if(!theSiteIsInTheBase(new Site(url, tKeyWord))) {
                    searchEngineBase.add(new Site(url, tKeyWord));
                    printOk();
                }
                else {
                    Site site = getSite(url);
                    site.addKeyWord(tKeyWord);
                    printOk();
                }
            }
            case "Search" -> {
                String result = "Results:";
                int n = 0, s = 1;
                String tKeyWord = question[1];
                for (Site site: searchEngineBase){
                    if(site.findKeyWord(tKeyWord)) System.out.println("Найдено слово" + tKeyWord + " " +
                            site.getUrl());
                }

            }
            case "Remove" -> {
                String tKeyWord = question[2];
                Site site = getSite(url);
                if(site.removeKeyWord(tKeyWord)) printOk();
                else printNotFound();
            }
        }
    }
    public boolean theSiteIsInTheBase(Site site){
        return searchEngineBase.contains(site);
    }
    public Site getSite(String url){
        for(Site site: searchEngineBase){
            if(site.getUrl().equals(url)) return site;
        }
        return null;
    }
    public void printOk(){
        System.out.println("OK\n======");
    }
    public void printAlreadyExists(){
        System.out.println("Already exists\n======");
    }
    public void printNotFound(){
        System.out.println("Not Found\n======");
    }
}


