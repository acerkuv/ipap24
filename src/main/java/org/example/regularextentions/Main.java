package org.example.regularextentions;
//https://javarush.com/groups/posts/regulyarnye-vyrazheniya-v-java

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        }



}
