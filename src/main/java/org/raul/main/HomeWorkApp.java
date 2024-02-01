package org.raul.main;


import org.raul.lesson_2.*;
import org.raul.lesson_2.utils.GetInput;

import java.util.Arrays;

class HomeWorkApp {
    public static void main(String[] args) {

/*
        // Driver for CheckSum
        System.out.print("Enter 1st int value: ");
        int a = GetInput.scan();
        System.out.print("Enter 2nd int value: ");
        int b = GetInput.scan();

        boolean isWithinRange = CheckSum.checkRangeOfSum(a, b);
        System.out.println(isWithinRange);
*/

/*
        // Driver for PositiveNegative
        System.out.print("Enter any int value: ");
        int value = GetInput.scan();

        PositiveNegative.isPositiveOrNegative(value);
*/

/*
        // Driver for PositiveNegativeReturn
        System.out.print("Enter any int value: ");
        int value = GetInput.scan();

        boolean isTrue = PositiveNegativeReturn.isTrueOrFalse(value);
        System.out.println(isTrue);
*/

/*
        IterateString.iterateStringByNumber("Java", 7);

        System.out.println(LeapYear.isLeapYear());

        SwapNumbers.swapZerosAndOnes();

        FillArray.fillEmptyArray();

        Multiply.arrElementsByTwo();

        TwoDimensional.fillGrid();
*/

/*
        // Driver for OneDimensional
        System.out.print("Enter length of array: ");
        int len = GetInput.scan();
        System.out.print("Enter initial value: ");
        int initialValue = GetInput.scan();

        int[] printArr = OneDimensional.generateArrFromInput(len, initialValue);
        System.out.print(Arrays.toString(printArr));
*/

/*
        // Driver for Rotation (***)
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = -2;
        Rotation.rotateArrayElements(arr, n);
*/

        // To make sure the scanner resource is closed at the end
        GetInput.scanClose();
    }
}
