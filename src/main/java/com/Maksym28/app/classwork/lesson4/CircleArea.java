package com.Maksym28.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by lobenko on 26.01.2017.
 */
public class CircleArea {
    static Scanner scanner = new Scanner(System.in);
    public static final double PI = 3.14d;
    public static void calculate()

    {
        System.out.println("CircleArea: this utility calculates circle area by the radius.");

        System.out.println("please input circle radius");
        double radius = scanner.nextDouble();
        double r2 = radius * radius;
        double circleArea = r2 * Math.PI;
        System.out.println("Area is " + circleArea);
    }

}


