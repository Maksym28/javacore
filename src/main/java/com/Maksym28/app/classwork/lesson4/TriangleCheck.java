package com.Maksym28.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by lobenko on 26.01.2017.
 */
public class TriangleCheck {
    static Scanner scanner = new Scanner(System.in);

    public static void Check()

    {
        System.out.println("please input katet1 ");
        double katet1 = scanner.nextDouble();

        System.out.println("please input katet2 ");
        double katet2 = scanner.nextDouble();

        System.out.println("please input hypo ");
        double hypo = scanner.nextDouble();


        if ((Math.pow(hypo,2)) == (Math.pow(katet1,2)+Math.pow(katet2,2)))
            System.out.println("Triangle is Right angled");
        else
            System.out.println("Triangle is not Right Angled");
    }
}


