package org.example.searchengine;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class Read {
    private final String filename;
    private final HashMap<String, ArrayList<String>> searchEngine = new HashMap<>();

    public Read(String filename) {
        this.filename = filename;
    }

    public void readFile()  {
        File file = new File(filename);
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
// Разбиваем строку на слова и, в зависимости от ситуации, обрабатываем их должным образом
    public void fillSearchEngineBase(String line) {
        String[] lineStrings = line.split(" ");
//            добавить данные в базу
        if (lineStrings[0].equals("Add")) {
            String urlSite = lineStrings[lineStrings.length - 1];
            String keyWord = lineStrings[2];
            addKeyWord(urlSite, keyWord);

//            добавить проверку  на поиск по словам
        } else if (lineStrings[0].equals("Search")) {
            System.out.println(seekKeyWord(lineStrings[1]));
//          удаление из базы
        } else if (lineStrings[0].equals("Remove")) {
             removeKeyWord(lineStrings[lineStrings.length - 1],lineStrings[2]);
        }
    }
    public void removeKeyWord( String url, String keyWord){
        ArrayList<String> listKeyWords = searchEngine.get(url);
        if (isInUrls(url) && isInKeyWordsList(listKeyWords, keyWord) ) {
            listKeyWords.remove(keyWord);
            searchEngine.put(url, listKeyWords);
            prOk();
        }
        else if (isInUrls(url) && !isInKeyWordsList(listKeyWords, keyWord)){
            prNotFound();
        }
    }
//    Добавление в поисковую базу слова
    public void addKeyWord(String url, String keyWord) {
//        Если слова в базе нет, то добавляем
        if(!isInUrls(url)) {
            searchEngine.put(url, new ArrayList<>(Arrays.asList(keyWord)));
            prOk();
        }
//        Иначе проверяем на то, есть ли слово в базе у этого сайта
        else {
            ArrayList<String> keysList = searchEngine.get(url);
//            Если его нет, то добавляем
            if (!isInKeyWordsList(keysList,keyWord)){
                keysList.add(keyWord);
                searchEngine.put(url, keysList);
                prOk();
//                Иначе выводим сообщение о том, что оно уже есть в базе
            }else{
                prExist();
            }
        }
    }
//    ПОиск слова по всей базе
    public String seekKeyWord(String keyWord) {
        int n = 1, s = 0;
        String result = "";
        for (String url : searchEngine.keySet()) {
            ArrayList<String> listKeywords = searchEngine.get(url);
            for (String kl : listKeywords) {
                if (kl.equals(keyWord)) {
                    s++;
                    result +=  n + ") " + url + "\n";
                    n++;
                }
            }
        }
        return "Results: " + s + " site(s) found \n" + result +"\n=====";
    }
//    Есть ли сайт в списке ключей базы
    public boolean isInUrls(String url){
        for (String u:searchEngine.keySet()) if(u.equals(url)) return true;
        return false;
    }
// Есть ли слово в списке поисковых слов
    public boolean isInKeyWordsList(ArrayList<String> listOfKeys, String keyWord){
        for (String key: listOfKeys) if(key.equals(keyWord)) return true;
        return false;
    }
    public void prOk(){
        System.out.println("Ok\n=====");
    }
    public void prExist(){
        System.out.println("Already Exist\n=====");
    }
    public void prNotFound(){
        System.out.println("Not Found\n=====");
    }

}
