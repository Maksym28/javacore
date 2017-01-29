package com.Maksym28.app.homework.lesson4;

import java.util.Scanner;

/**
 * Created by lobenko on 26.01.2017.
 */
public class CircleAreaCompare {
    static Scanner scanner = new Scanner(System.in);
    public static final double PI = 3.14d;

    public static String Compare(double radius1, double radius2){


        double area1 = PI * Math.pow(radius1, 2);
        double area2 = PI * Math.pow(radius2, 2);

        if (area1==area2)
            return "Area of circle 1 is equal to area of circle 2";
        else
            if (area1 > area2)
                return "Area of circle 1 is bigger";
            else
                return "Area of circle 2 is bigger";
    }
}


