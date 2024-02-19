package org.raul.lesson_6.main;

import org.raul.lesson_6.model.MultiDimensional;
import org.raul.lesson_6.model.MultiDimensionalGenerator;
import org.raul.lesson_6.my_exceptions.MyArrayDataException;
import org.raul.lesson_6.my_exceptions.MyArraySizeException;

import java.util.Scanner;

/* 3.В методе main() вызвать полученный метод, обработать возможные исключения
MyArraySizeException и MyArrayDataException и вывести результат расчета.*/
class DriverClass {
    public static void main(String[] args) {
        MultiDimensional md = new MultiDimensional();

        String text = "423";

        System.out.print("Provide size for row: ");
        md.setRow(new Scanner(System.in).nextInt());
        System.out.print("Provide size for column: ");
        md.setCol(new Scanner(System.in).nextInt());

        try {
            MultiDimensionalGenerator.generate2DArray(md, text);
            String[][] generatedArr = md.getArray2D();

            for (int i = 0; i < generatedArr.length; i++) {
                System.out.print("[");
                for (int j = 0; j < generatedArr.length; j++) {
                    String printFormat = (j != generatedArr.length - 1) ? ", " : "]";
                    System.out.print(generatedArr[i][j] + printFormat);
                }
                System.out.println();
            }
            System.out.println("Sum of the array elements is : " + md.getSum());

        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
