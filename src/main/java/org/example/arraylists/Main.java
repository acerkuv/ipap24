package org.example.arraylists;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.File;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        //Суммируем листы
        List<String> list = new ArrayList<>(Arrays.asList("Jonny", "Max", "Piter"));
        List<String> list1 = new ArrayList<>(Arrays.asList("Margo", "Laura","Helen"));
        System.out.println("Слияние листов " + list + " + " + list1 + " = " +
               sumList(list, list1) );


        //Работа с фалами
        System.out.println("\n Читаем поэму из файла (только 5 строк): ");
        List<String> upperCaseList = readFile("poem.txt", 5);
        System.out.println(" \n Тоже самое заглавным  \n" );
        for (String s: upperCaseList) System.out.println(s);

        //Животные
        List<Runable> pets = new ArrayList<>(Arrays.asList(
                new Cat("Murka"), new Dog("Bobik"),
                new Cat("Barsik"), new Dog("Muhtar")
        ));
        System.out.println("\n Как животные могут двигаться \n");
        for (Runable r: pets) System.out.println(r.run());
    }
    @Contract("_, _ -> param1")
    public static List<String> sumList(List<String> list, @NotNull List<String> list1){
        for(String str: list1) list.add(str);
        return list;
    }
    public static @NotNull List<String>  readFile(String fileName, int countRowToRead){
        List <String> capsLockRows = new ArrayList<>();
        try {
            File poem = new File(fileName);
            Scanner scanner = new Scanner(poem);
            System.out.println();
            while (scanner.hasNext() && countRowToRead > 0) {
                String row = scanner.nextLine();
                System.out.println(row);
                capsLockRows.add(row.toUpperCase());
                countRowToRead --;
                }
            scanner.close();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
        }
        return capsLockRows;
    }
}
