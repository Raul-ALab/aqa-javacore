package org.raul.lesson_2;

public class CheckSum {

    /* 1.Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false. */
    public boolean checkRangeOfSum() {
        int a = GetInput.scan();
        int b = GetInput.scan();
        int sum = a + b;

        boolean result = sum >= 10 && sum <= 20;

        return result;
    }
}
