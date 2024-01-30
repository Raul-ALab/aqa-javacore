package org.raul.lesson_2;

public class PositiveNegative {

    /* 2.Написать метод, которому в качестве параметра передается
    целое число, метод должен напечатать в консоль, положительное ли
    число передали или отрицательное. Замечание: ноль считаем
    положительным числом. */
    public static void isPositiveOrNegative() {
        System.out.print("Enter any int value: ");
        int value = GetInput.scan();

        String result = (value >= 0) ? "Число положительное" : "Число отрицательное";
        System.out.println(result);
    }
}
