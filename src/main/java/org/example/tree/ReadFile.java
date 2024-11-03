package org.example.tree;

import org.example.searchengine2.Site;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ReadFile {
    public Map<String, Integer> reactions = new HashMap<>();
    public int q = 0;
    public void readFile() {
        File file = new File("amchemy.txt");
        Charset charset = StandardCharsets.US_ASCII;
        try (BufferedReader reader = Files.newBufferedReader(file.toPath(), charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                fillList(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }

    private void fillList(String line) {
        reactions.put(line, q);
        q++;
    }
    private Map<String, Integer> getReactions(){
        return reactions;
    }

}
