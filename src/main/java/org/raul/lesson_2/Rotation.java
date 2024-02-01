package org.raul.lesson_2;

import java.util.Arrays;

public class Rotation {

    /* ***Написать метод, которому на вход подается одномерный
    массив и число n (может быть положительным, или отрицательным),
    при этом метод должен сместить все элементы массива на n позиций.
    Элементы смещаются циклично. Для усложнения задачи нельзя
    пользоваться вспомогательными массивами. */
    public static void rotateArrayElements(int[] arr, int n) {
        int[] holder = new int[arr.length];

        if (n >= 0) { // shift to right
            for (int arrIndex = 0; arrIndex < arr.length - n; ) {
                for (int holderIndex = n; holderIndex < arr.length; holderIndex++) {
                    holder[holderIndex] = arr[arrIndex++];
                }
            }
            int remain = arr.length - 1;
            for (int holderIndex = n - 1; holderIndex >= 0; holderIndex--) {
                holder[holderIndex] = arr[remain--];
            }
        } else if (n < 0) { // shift to left
            n *= -1;
            for (int arrIndex = n; arrIndex < arr.length; ) {
                for (int holderIndex = 0; holderIndex < arr.length - n; holderIndex++) {
                    holder[holderIndex] = arr[arrIndex++];
                }
            }
            int remain = 0;
            for (int holderIndex = arr.length - n; holderIndex < arr.length; holderIndex++) {
                holder[holderIndex] = arr[remain++];
            }
        }
        // Copy elements from holder array back to the original array
        for (int i = 0; i < holder.length; i++) {
            arr[i] = holder[i];
        }
        System.out.println("rotated array: " + Arrays.toString(arr));
    }
}
