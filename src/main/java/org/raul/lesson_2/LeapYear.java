package org.raul.lesson_2;

public class LeapYear {

    /* (*)Написать метод, который определяет, является ли год високосным,
    и возвращает boolean (високосный - true, не високосный - false).
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом
    каждый 400-й – високосный. */
    public static boolean isLeapYear() {
        System.out.print("Enter a year to be checked: ");
        int year = GetInput.scan();

        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 100 == 0 && year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
