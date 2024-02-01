package org.raul.lesson_2;

import org.raul.lesson_2.utils.GetInput;

public class PositiveNegativeReturn {

    /* 3.Написать метод, которому в качестве параметра передается
    целое число. Метод должен вернуть true, если число отрицательное,
    и вернуть false если положительное.
    Замечание: ноль считаем положительным числом. */
    public static boolean isTrueOrFalse(int value) {

        boolean result = (value < 0) ? true : false;

        return result;
    }
}
