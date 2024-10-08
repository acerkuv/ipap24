package org.example.exceptions;

import java.util.Scanner;

public class Calculation {

    public String readExtraMas(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int l = 0; l < arr.length + 1; l++) {
            try {
                sb.append(arr[l]).append(" ");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Перебор, шаг " + l++ +
                        " сделать невозможно, потому что массив содержит " +
                        arr.length + " элементов, первй шаг 0");
            }
        }
        return sb.toString();
    }

    public String mulArr(int[] arr, int n) throws ArithmeticException {
        StringBuilder stringBuilder = new StringBuilder();
        for (int a : arr) {
            try {
                int t = n / a;
                stringBuilder.append(a * n).append(" ");
            } catch (ArithmeticException e) {
                System.out.println("Ошибка, выбранн элемент = 0, " +
                        "поэтому этот шаг в обработке пропущен ");
            }
        }
        return stringBuilder.toString();
    }
}
