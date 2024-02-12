package org.raul.lesson_2;

import org.raul.lesson_2.utils.GetInput;

public class PositiveNegative {

    /* 2.Написать метод, которому в качестве параметра передается
    целое число, метод должен напечатать в консоль, положительное ли
    число передали или отрицательное. Замечание: ноль считаем
    положительным числом. */
    public static void isPositiveOrNegative(int value) {

        String result = (value >= 0) ? "Число положительное" : "Число отрицательное";
        System.out.println(result);
    }
}
