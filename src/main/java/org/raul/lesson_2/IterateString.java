package org.raul.lesson_2;

public class IterateString {

    /* 4.Написать метод, которому в качестве аргументов передается
    строка и число, метод должен отпечатать в консоль указанную
    строку, указанное количество раз. */
    public static void iterateStringByNumber(String word, int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i + ". " + word);
        }
    }
}
