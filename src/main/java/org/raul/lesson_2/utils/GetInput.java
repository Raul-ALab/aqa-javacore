package org.raul.lesson_2.utils;

import java.util.Scanner;

public class GetInput {
    static Scanner scanner = new Scanner(System.in);

    // This method is used to get console inputs
    // for int values
    public static int scan() {
        int value = scanner.nextInt();

        return value;
    }

    public static void scanClose() {
        scanner.close();
    }
}
