package org.example.streams;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        /*  Упр.1. Создать ArrayList с числами. Отфильтровать только четные числа,
            потом возвести их вквадрат, потом оставить
            только первые три элемента и вывести в консоль.
        */

        List<Integer> list =new ArrayList<>(List.of(1, 3, 4, 7, 8, 10, 22, 44, 3, 7, 99));
        List l = list.stream()
                    .filter(x->x%2 == 0).map(x -> Math.pow(x, 2))
                        .limit(3)
                            .collect(Collectors.toList());
        l.stream().limit(3).forEach(x -> System.out.println(x));


    }

//        Упр.2. Создать метод, который принимает массив строк, создает stream и
//        возвращает количество слов, которые длиннее четырех символов.
//        Покрыть тестами.

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
       return nums.stream().reduce(10,(acc, x) -> acc + x);}

//    Упр.5. Дан Map<String, Integer>, представляющий товары и их цены.
//    Увеличьте цену каждого товара на 10% и верните новый Map с обновленными ценами.
    public  static Map<String, Double> toReducedMap2(Map<String, Double> test){
        return test.entrySet().stream().map( entry -> {
            String product = entry.getKey();
            double originalPrice = entry.getValue();
            double updatedPrice = originalPrice * 1.1; // + 10%
            return Map.entry(product, updatedPrice);
        })
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
}
/*   Упр.6. Дан Map<String, Integer>, где ключи — это названия товаров, а значения — их цены.
    Написать метод, который  используя Stream, находит общую сумму цен всех товаров.
    Покрыть тестами)
*/
    public static double allGoodsAmount(Map<String, Double> goods){
        return goods.entrySet().stream().map(Map.Entry::getValue).reduce(0d, (acc, x)-> acc + x);
    }

    /*Упр.7. Создать класс Flower, который содержит два поля – название цветка и количество нектара (int).Также класс содержит метод, возвращающий значение поля «количество нектара».
    В main создать ArrayList из цветков. С помощью stream отфильтровать те цветы,количество нектара у которых больше указанного числа. Вывести в консоль.
            Дальше:
    Создать статический метод, который принимает ArrayList цветов и число, по которому хотим отфильтровать. Метод возвращает число цветов, прошедших фильтрацию (напр, у скольких цветов нектар > 5). Покрыть метод тестами.
    */
    public static  int qtyNectar(Flower[] flowers){
        return Arrays.stream(flowers).map(Flower::getWeightOfNectar).reduce(0, (acc, x)->acc + x);
    }

}

