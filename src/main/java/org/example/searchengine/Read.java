package org.example.searchengine;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class Read {
    private String filename;
    private final HashMap<String, ArrayList<String>> searchEngine = new HashMap<>();

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
            String keyWord = lineStrings[2];
            saveData(urlSite, keyWord);

//            Todo добавить данные в базу
        } else if (lineStrings[0].equals("Search")) {
//            Todo добавить проверку  на поиск по словам

        }else{
//            Todo добавть удаление из базы
        }
    }
    public void saveData(String url, String key ){
        searchEngine.computeIfAbsent(url, k -> new ArrayList<>(Arrays.asList(key)));
        if(searchEngine.get(url)!=null) {
            ArrayList<String> keyWords = searchEngine.get(url);
            boolean isInBase = false;
//           проверка есть уже кейворд в базе
            for (String s : keyWords) {
                if (key.equals(s)) {
//                   уже есть в базе
                    isInBase = true;

                }

            }
            if (!isInBase) {
                keyWords.add(key);
                searchEngine.put(url, keyWords);
            }

        }
    }
}
