package com.Maksym28.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by lobenko on 26.01.2017.
 */
public class CircleAreaCompare {
    static Scanner scanner = new Scanner(System.in);
    public static final double PI = 3.14d;

    public static void Compare(){

        System.out.println("CircleAreaCompare: this utility compares areas of two circles by the radiuses provided.");

        System.out.println("please input circle 1 radius");
        double radius1 = scanner.nextDouble();

        System.out.println("please input circle 2 radius");
        double radius2 = scanner.nextDouble();

        double area1 = PI * Math.pow(radius1, 2);
        double area2 = PI * Math.pow(radius2, 2);

        if (area1 > area2)
            System.out.println("Area1 is bigger");
        else
            System.out.println("Area2 is bigger");
    }
}


