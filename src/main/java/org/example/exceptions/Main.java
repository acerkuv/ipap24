package org.example.exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner scanner = new Scanner(System.in);
        Calculation calculation = new Calculation();

        int[] tArr = new int[]{1, 2, 0, 9, 7, 1};

//        System.out.println(calculation.readExtraMas(tArr));
//
//        System.out.println("Введите число N, на которое нужно умножить массив " );
//        int N = scanner.nextInt();
//        System.out.println( calculation.mulArr(tArr, N));

        Login login = new Login();
        login.inputD("alex", "qw", "qw1");

    }


}
