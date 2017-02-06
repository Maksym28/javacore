package com.Maksym28.app.homework.lesson6;

import java.util.Scanner;

/**
 * Created by lobenko on 02.02.2017.
 */

    public class CountEvensAtoN {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This utility counts how many even numbers are from A to N");
        System.out.println("Enter A and press Enter");
        int initial = scanner.nextInt();
        System.out.println("Enter N and press Enter");
        int N = scanner.nextInt();
        int a = initial;
        int i = 0;

        while (a < N) {
            if (a % 2 == 0)
                i = i + 1;
                a = a + 1;
        }
        System.out.println("The count of even numbers from " + a + " to N " + N + " is i=" + i);
    }
}
