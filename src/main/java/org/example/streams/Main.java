package org.example.streams;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//Упр.1. Создать ArrayList с числами. Отфильтровать только четные числа,
// потом возвести их вквадрат, потом оставить
// только первые три элемента и вывести в консоль.
        int[] numbers = {1, 3, 50, 7, 14, 25, 190, 1, 0, -10};


        List<Integer> list =new ArrayList<>(List.of(1, 3, 4, 7, 8, 10, 22, 44, 3, 7, 99));
        List l = list.stream()
                    .filter(x->x%2 == 0).map(x -> Math.pow(x, 2))
                        .limit(3)
                            .collect(Collectors.toList());
        l.stream().limit(3).forEach(x -> System.out.println(x));

//        Упр.2. Создать метод, который принимает массив строк, создает stream и
//        возвращает количество слов, которые длиннее четырех символов.
//        Покрыть тестами.

        String[] strings = {"Good", "morning", "my", "dear", "friend", "i", "am",
        "glad to see", "you"};
        ArrayList <Integer> numb2 = new ArrayList<>(List.of(1, 3, 4, 7, 8, 10, 22, 44, 3, 7, 99));
        System.out.println(sumNumbers(numb2));
    }
    public static String[] checkMessage(String[] message){
        return Arrays.stream(message).filter(x->x.length() > 4)
                .toArray(size -> new String[size]);
    }
//    Упр.3. Создать метод, который принимает массив чисел, создает стрим и
//    подсчитывает, сколько в массиве чисел, больше заданного значения
//    (например > 5). Покрыть тестами.


    public static int countNumbers(int[] nums){
        return (int) Arrays.stream(nums).filter(x-> x > 5).count();
    }

//    Упр.4. Создать метод, который принимает ArrayList с числами,
//    создает stream и подсчитывает суммувсех чисел(метод reduce),
//    результат возвращает. Покрыть тестами.

   public static double sumNumbers(ArrayList<Integer> nums){
        return nums.stream().reduce(10,(acc, x) -> acc + x);
   }


}
