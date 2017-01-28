package com.Maksym28.app.homework.lesson4;

import java.util.Scanner;

/**
 * Created by lobenko on 26.01.2017.
 */
public class LargerNumber {
    static Scanner scanner = new Scanner(System.in);

    public static String Check(double numberA, double numberB)

    {
        String retString;
        if (numberA==numberB)
            retString = "You tricky bitch!";
        else
            if (numberA>numberB)
                retString = "Number A = " + numberA + " is bigger than Number B = " + numberB;
            else
                retString = "Number B = " + numberB + " is bigger than Number A = " + numberA;


        return retString;
    }
}


