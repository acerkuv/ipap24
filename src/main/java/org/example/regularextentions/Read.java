package org.example.regularextentions;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


// Чтение файла readFile()
public class Read {
    String filename;
    static List<Product> result =  new ArrayList<>();

    public Read(String filename) {
        this.filename = filename;
    }
//    Открыть файл и пнрочитать
    public void readFile() {
        File file = new File(filename);
        Charset charset = StandardCharsets.UTF_8;
        try (BufferedReader reader = Files.newBufferedReader(file.toPath(), charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {

//               прочитать строку их файла
                readInLie(line);

            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }

//    Разьираем строку на слова
    private void readInLie(String line) {

        Matcher[] matchersLine ={
                Pattern.compile("^[а-я]++").matcher(line),  //name
                Pattern.compile("[\\d+]{2}").matcher(line), //number
                Pattern.compile("[a-z0-9]{4}").matcher(line), //code

        };
        //
        try{
            result.add(new Product(
                    findWord(matchersLine[0], line ), //name
                    findWord(matchersLine[1], line ), // number
                    findWord(matchersLine[2], line ) //code
            ));
        }catch (Exception e){
            System.err.format("IOException: %s%n", e);
        }

    }

//    Выделяем слови из строки
    public static String findWord( Matcher matcher, String string){
        String result = null;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            result =   string.substring(start, end);
        }
        return result;
    }
//    Сортируем лист продуктов по заданию
    public static List<Product> sortedProd(){
        return result.stream()
                .sorted(Comparator.comparing(Product::getCode).reversed()).toList();
    }


}
