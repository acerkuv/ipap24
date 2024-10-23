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
        String[] question = line.split("");
        switch (question[0]) {
            case "Add" -> {
            }
            case "Search" -> {
            }
            case "Remove" -> {
            }
        }

    }
}


