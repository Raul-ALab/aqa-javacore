package org.raul.lesson_2;

import java.util.Scanner;

public class GetInput {

    // This method is used to get console inputs
    public static int scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter int value: ");
        int value = scanner.nextInt();

        return value;
    }
}
