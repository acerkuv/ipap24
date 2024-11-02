package org.example.streams;
/*
Упр.7. Создать класс Flower, который содержит два поля – название цветка и количество нектара
    (int).Также класс содержит метод, возвращающий значение поля «количество нектара».
     В main создать ArrayList из цветков. С помощью stream отфильтровать те цветы,
     количество нектара у которых больше указанного числа. Вывести в консоль.
        Дальше:
        Создать статический метод, который принимает ArrayList цветов и число,
        по которому хотим отфильтровать. Метод возвращает число цветов,
        прошедших фильтрацию (напр, у скольких цветов нектар > 5). Покрыть метод тестами.
*/

public class Flower {
    public Flower(String nameOfFlower, int weightOfNectar) {
        this.nameOfFlower = nameOfFlower;
        this.weightOfNectar = weightOfNectar;
    }

    String nameOfFlower;
    int weightOfNectar;
    public int getWeightOfNectar(){
        return weightOfNectar;
    }
}
