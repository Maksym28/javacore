package com.Maksym28.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by lobenko on 26.01.2017.
 */
public class LargerNumber {
    static Scanner scanner = new Scanner(System.in);

    public static void Check()

    {
        System.out.println("LargerNumber:This utility compares two numbers number A and number B");

        System.out.println("please input number A");
        double numberA = scanner.nextInt();

        System.out.println("please input number B");
        double numberB = scanner.nextInt();


        if (numberA==numberB)
            System.out.println("You tricky bitch!");
        else
            if (numberA>numberB)
                System.out.println("Number A = " + numberA + "is bigger than Number B = " + numberB);
            else
                System.out.println("Number B = " + numberB + "is bigger than Number A = " + numberA);
    }
}


