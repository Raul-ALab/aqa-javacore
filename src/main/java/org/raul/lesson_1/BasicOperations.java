package org.raul.lesson_1;

public class BasicOperations {

    // Task.2
    public void printThreeWords() {
        System.out.println("Orange\n\nBanana\n\nApple");
    }

    // Task.3
    public void checkSumSign() {
        int a = 7;
        int b = 10;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Task.4
    public void printColor() {
        int value = 111;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value >0 && value <= 100 ) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Используемое значение должно быть только 'int'");
        }
    }

    // Task.5
    public void compareNumbers() {
        int a = 70;
        int b = 333;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
