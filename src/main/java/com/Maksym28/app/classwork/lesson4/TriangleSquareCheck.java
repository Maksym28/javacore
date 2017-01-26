package com.Maksym28.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by lobenko on 26.01.2017.
 */
public class TriangleSquareCheck {
    static Scanner scanner = new Scanner(System.in);

    public static void Check()

    {
        System.out.println("please input side1 ");
        double side1 = scanner.nextDouble();
        side1=Math.pow(side1,2);

        System.out.println("please input side2 ");

        double side2 = scanner.nextDouble();
        side2=Math.pow(side2,2);

        System.out.println("please input side3 ");
        double side3 = scanner.nextDouble();
        side3=Math.pow(side3,2);

        if ((side3==(side1+side2))||(side1==(side2+side3))||(side2==(side1+side3)))
            System.out.println("Triangle is Right angled");
        else
            System.out.println("Triangle is not Right Angled");
    }
}


