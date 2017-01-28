package com.Maksym28.app.homework.lesson4;

import java.util.Scanner;

/**
 * Created by lobenko on 26.01.2017.
 */
public class CircleArea {
    static Scanner scanner = new Scanner(System.in);
    public static final double PI = 3.14d;
    public static double calculate(double radius)
    {

        double r2 = radius * radius;
        double circleArea = r2 * Math.PI;
        System.out.println("Area is calculated");
        return r2;

    }

}


