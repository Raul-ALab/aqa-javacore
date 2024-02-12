package org.raul.lesson_5;

/* 1.Написать метод, который меняет два элемента массива
местами (массив может быть любого ссылочного типа).*/
public class SwapGenericsArr {
    public static <T> void swapElements(T[] arr, int aIndex, int bIndex) {
        T tempHolder = arr[aIndex];
        arr[aIndex] = arr[bIndex];
        arr[bIndex] = tempHolder;
    }
}
