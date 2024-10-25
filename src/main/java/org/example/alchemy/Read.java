package org.example.alchemy;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.TreeMap;

public class Read {
//    TreeMap<Reaction, Reaction> magicAlgorithms   = new TreeMap<>();
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
            String[] lineStrings = line.split(" ");
            if(lineStrings[1].equals("->")){

            }
    }
}
