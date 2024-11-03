//import org.example.streams.Flower;
//import org.example.streams.Main;
//
//import java.util.*;
//import java.util.stream.Stream;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class MainTest {
//    /*        Упр.2. Создать метод, который принимает массив строк, создает stream и
//        возвращает количество слов, которые длиннее четырех символов.
//        Покрыть тестами.
//*/
//    @Test
//    void checkMessageMy() {
//
//        String[] strings = {"Good", "morning", "my", "dear", "friend", "i", "am",
//                "glad to see", "you"};
//
//        String[] result= {"morning",  "friend",  "glad to see" };
//        Assertions.assertArrayEquals(result, Main.checkMessage(strings));
//    }
//
//    @Test
//    void countNumbers() {
//        int[] numbers = {1, 3, 50, 7, 14, 25, 190, 1, 0, -10};
//        Assertions.assertEquals(5, Main.countNumbers(numbers));
//    }
//
//    //    Упр.4. Создать метод, который принимает ArrayList с числами,
////    создает stream и подсчитывает суммувсех чисел(метод reduce),
////    результат возвращает. Покрыть тестами.
//    @Test
//    void sumNumbers() {
//        ArrayList <Integer> numb2 = new ArrayList<>(List.of(1, 3, 4, 7, 8, 10, 22, 44, 3, 7, 99));
//        Assertions.assertEquals(218, Main.sumNumbers(numb2));
//    }
//
//
///*numb2
//    Упр.5. Дан Map<String, Integer>, представляющий товары и их цены.
//    Увеличьте цену каждого товара на 10% и верните новый Map с обновленными ценами.
//*/
//    @Test
//    void toReducedPrice() {
//        Map<String, Double> goods = Map.of("Table", 70d, "Book", (double) 10, "Pencil", (double) 1);
//        Map<String, Double> reducedGoods = Map.of("Table",  77d, "Book", (double) 11, "Pencil",  1.1);
//        Assertions.assertIterableEquals(
//                Collections.singleton(reducedGoods), Collections.singleton(Main.toReducedMap2(goods))
//        );
//    }
//
//    /*   Упр.6. Дан Map<String, Integer>, где ключи — это названия товаров, а значения — их цены.
//        Написать метод, который  используя Stream, находит общую сумму цен всех товаров.
//        Покрыть тестами)
//    */
//    @Test
//    void allGoodsAmount() {
//        Map<String, Double> goods = Map.of("Table", 70d, "Book", (double) 10, "Pencil", (double) 1);
//        Assertions.assertEquals(81, Main.allGoodsAmount(goods));
//    }
//    @Test
//    void getNectarAmount(){
//        Flower[] flowers = {
//                new Flower("Rose", 10),
//                new Flower("Tulip", 20),
//                new Flower("Chamomile", 5)
//        };
//        Assertions.assertEquals(35, Main.qtyNectar(flowers));
//
//
//    }
//
//
//}