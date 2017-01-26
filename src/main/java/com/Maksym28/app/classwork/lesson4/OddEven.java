package com.Maksym28.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by lobenko on 26.01.2017.
 */
public class OddEven {
    static Scanner scanner = new Scanner(System.in);

    public static void Check()

    {
        System.out.println("please input number ");
        int number1 = scanner.nextInt();
        int odder1 = number1/2;
        int odder2 = number1 - (odder1+odder1);

        if (odder2>0)
            System.out.println("Number is odd");
        else
            System.out.println("Number is even");
    }
}


