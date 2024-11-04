package org.example.regularextentions;
//https://javarush.com/groups/posts/regulyarnye-vyrazheniya-v-java

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/*кровать 20 aabn
        стул 50 ab46
        стол 60 c34i
        шкаф 88 cvfg
        тумбочка 85 avfg
        Считать данные из файла в ArrayList (типа Product, класс Product содержит три поля).
        Создать стрим на основе
        ArrayList,  отфильтровать товары, артикулы которых:
        а) состоят сначала из латинских букв, потом из цифр
        б) начинаются на символ "а"
        в) содержат хотя бы одну цифру
        г) заканчиваются на символ "g"

*/
public class Main {

    public static void main(String[] args) {

//        Прочитать файл
        Read read = new Read("regular.txt");
        read.readFile();

//        Сортированный лист объектов Product по коду "code"
        List<Product> sortedList = Read.sortedProd();

//        Выводим отсортированные обекты в консоль
        for(Product product:sortedList)
            System.out.println(product.toString());


    }


}
