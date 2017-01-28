package com.Maksym28.app.homework.lesson4;

import java.util.Scanner;

/**
 * Created by lobenko on 26.01.2017.
 */
public class OddEven {
    static Scanner scanner = new Scanner(System.in);

    public static String Check(int number1)

    {
        int odder1 = number1/2;
        int odder2 = number1 - (odder1+odder1);

        String retString;
        if (odder2>0)
            retString = "Number is odd";
        else
            retString = "Number is even";

        return retString;
    }
}


