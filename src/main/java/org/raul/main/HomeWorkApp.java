package org.raul.main;


import org.raul.lesson_5.SwapGenericsArr;

import java.util.Arrays;

class HomeWorkApp {
    public static void main(String[] args) {

        /* Рауль: поскольку обобщения работают со ссылочными типами,
        для этого метода следует использовать только ссылочные типы.*/
        Integer[] numArr = {5, 4, 2, 7};
        SwapGenericsArr.swapElements(numArr, 0, 2);

        String[] strArr = {"Dog", "Hamster", "Cat"};
        SwapGenericsArr.swapElements(strArr, 1, 2);

        System.out.println(Arrays.toString(numArr));
        System.out.println(Arrays.toString(strArr));
    }
}
