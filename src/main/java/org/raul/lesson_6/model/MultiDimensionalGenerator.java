package org.raul.lesson_6.model;

import org.raul.lesson_6.my_exceptions.MyArrayDataException;
import org.raul.lesson_6.my_exceptions.MyArraySizeException;
import org.raul.lesson_6.utils.Conversion;

/* 1.Напишите метод, на вход которого подается двумерный строковый
массив размером 4х4. ...*/
public class MultiDimensionalGenerator {
    public static MultiDimensional generate2DArray(MultiDimensional md, String arrElements)
            throws MyArraySizeException, MyArrayDataException {

        /* 1. ...При подаче массива другого размера необходимо
        бросить исключение MyArraySizeException.*/
        if (md.getRow() != 4 || md.getCol() != 4) {
            throw new MyArraySizeException("The expected size is 4x4 for this 2D array.");
        } else {
            String[][] squareArr = new String[md.getRow()][md.getCol()];
            int elementsSum = 0;
                /* 2.Далее метод должен пройтись по всем элементам массива,
                преобразовать в int и просуммировать. ...*/
            for (int i = 0; i < squareArr.length; i++) {
                for (int j = 0; j < squareArr.length; j++) {
                    squareArr[i][j] = Conversion.stringCharConversion(j, arrElements);
                    /* 2. ...Если в каком-то элементе массива преобразование не удалось
                    (например, в ячейке лежит символ или текст вместо числа), должно быть
                    брошено исключение MyArrayDataException с детализацией, в какой именно
                    ячейке лежат неверные данные.*/
                    try {
                        elementsSum += Integer.parseInt(squareArr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("Cannot parse the element '"
                                + Conversion.stringCharConversion(j, arrElements)
                                + "' at index " + i + j);
                    }
                }
                md.setSum(elementsSum);
                md.setArray2D(squareArr);
            }
        }
        return new MultiDimensional(md.getArray2D(), md.getSum());
    }
}
