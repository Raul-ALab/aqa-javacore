package org.raul.lesson_2;

import org.raul.lesson_2.utils.GetInput;

public class OneDimensional {

    /* 9.*Написать метод, принимающий на вход два аргумента: len
    и initialValue, и возвращающий одномерный массив типа int
    длиной len, каждая ячейка которого равна initialValue. */
    public static int[] generateArrFromInput(int len, int initialValue) {
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
