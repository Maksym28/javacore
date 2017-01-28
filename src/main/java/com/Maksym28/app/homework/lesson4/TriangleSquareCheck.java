package com.Maksym28.app.homework.lesson4;

import java.util.Scanner;

/**
 * Created by lobenko on 26.01.2017.
 */
public class TriangleSquareCheck {
    static Scanner scanner = new Scanner(System.in);

    public static String Check(double side1, double side2, double side3)

    {
        side1=Math.pow(side1,2);
        side2=Math.pow(side2,2);
        side3=Math.pow(side3,2);
        String retString;
        if ((side3==(side1+side2))||(side1==(side2+side3))||(side2==(side1+side3)))
            retString = "Triangle is Right angled";
        else
            retString = "Triangle could not be not Right Angled";
        return retString;
    }
}


