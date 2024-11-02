package org.example.regularextentions;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Read {
    ArrayList<String> result =  new ArrayList<>();
    public void readFile() {
        File file = new File("regular.txt");
        Charset charset = StandardCharsets.US_ASCII;
        try (BufferedReader reader = Files.newBufferedReader(file.toPath(), charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                readInLie(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }

    private void readInLie(String line) {
        Pattern pattern = Pattern.compile("\\s");
        String[] strings = pattern.split(line,2);
        for (String s: strings) result.add(s);
    }


}
