package org.example.searchengine;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.HashMap;
import static java.nio.charset.StandardCharsets.UTF_8;

public class Read {
    private String filename;
    private final HashMap<String, String[]> searchEngine = new HashMap<>();

    public Read(String filename) {
        this.filename = filename;
    }

    public void readFile() throws IOException {
        File file = new File(filename);
        Charset charset = StandardCharsets.US_ASCII;
        try (BufferedReader reader = Files.newBufferedReader(file.toPath(), charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
                fillSearchEngineBase(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
    public void fillSearchEngineBase(String line){
        String[] lineStrings = line.split(" ");
        if(lineStrings[0].equals("Add")) {
            String urlSite = lineStrings[lineStrings.length - 1];
            System.out.println(urlSite);
//            Todo добавить данные в базу
        } else if (lineStrings[0].equals("Search")) {
//            Todo добавить проверку  на поиск по словам

        }else{
//            Todo добавть удаление из базы
        }
    }
}

