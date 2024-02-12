package org.raul.lesson_2;

public class TwoDimensional {

    /* 8.Создать квадратный двумерный целочисленный массив
    (количество строк и столбцов одинаковое), и с помощью
    цикла(-ов) заполнить его диагональные элементы единицами
    (можно только одну из диагоналей, если обе сложно). */
    public static void fillGrid() {
        int[][] squareArr = new int[5][5];

        for (int i = 0; i < squareArr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < squareArr.length; j++) {
                squareArr[i][j] = 1;
                String printFormat = (j != squareArr.length - 1) ? ", " : "]";
                System.out.print(squareArr[i][j] + printFormat);
            }
            System.out.println();
        }
    }
}
