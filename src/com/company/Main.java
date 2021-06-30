package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
на экран в строку. Определить и вывести на экран сообщение о том, является ли
массив строго возрастающей последовательностью. */

        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            Random rnd = new Random();
            arr[i] = rnd.nextInt(11);
            System.out.print(arr[i] + " ");
        }
        boolean task = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                task = false;
                break;
            }
        }
        System.out.println(" ");
        if (task) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");

        }
    }
}
