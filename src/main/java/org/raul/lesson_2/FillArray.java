package org.raul.lesson_2;

import java.util.Arrays;

public class FillArray {

    /* 6.Задать пустой целочисленный массив длиной 100.
    С помощью цикла заполнить его значениями 1 2 3 … 100. */
    public static void fillEmptyArray() {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
