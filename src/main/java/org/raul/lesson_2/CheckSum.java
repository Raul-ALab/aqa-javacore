package org.raul.lesson_2;

import org.raul.lesson_2.utils.GetInput;

public class CheckSum {

    /* 1.Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false. */
    public static boolean checkRangeOfSum(int a, int b) {
        int sum = a + b;

        boolean result = (sum >= 10 && sum <= 20) ? true : false;

        return result;
    }
}
