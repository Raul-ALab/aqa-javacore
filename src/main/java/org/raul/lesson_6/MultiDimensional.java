package org.raul.lesson_6;

import org.raul.lesson_6.my_exceptions.MyArraySizeException;

public class MultiDimensional {
    public void array2D(String textForArrElements, int iIndex, int jIndex) {
        if (iIndex == 4 && jIndex == 4) {
            String[][] squareArr = new String[iIndex][jIndex];

            char[] chars = textForArrElements.toCharArray();
            for (int i = 0; i < squareArr.length; i++) {
                System.out.print("[");
                for (int j = 0; j < squareArr.length; j++) {
                    // Будет произведено итерирование по символам строки,
                    // если длина меньше длины массива.
                    squareArr[i][j] = String.valueOf(chars[j % chars.length]);
                    String printFormat = (j != squareArr.length - 1) ? ", " : "]";
                    System.out.print(squareArr[i][j] + printFormat);
                }
                System.out.println();
            }
        } else {
            throw new MyArraySizeException("The expected size is 4x4 for this 2D array.");
        }
    }

    public static void fillArray(String[] strArray) {

    }
}
