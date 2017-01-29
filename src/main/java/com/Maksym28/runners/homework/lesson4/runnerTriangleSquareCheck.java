package com.Maksym28.runners.homework.lesson4;

import com.Maksym28.app.homework.lesson4.TriangleSquareCheck;

import java.util.Scanner;

/**
 * Created by lobenko on 26.01.2017.
 */
public class runnerTriangleSquareCheck {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TriangleSquareCheck: this utility checks if 3 integer numbers you provided could be the sides of square triangle");

        System.out.println("please input side1 ");
        double side1 = scanner.nextDouble();
        System.out.println("please input side2 ");
        double side2 = scanner.nextDouble();
        System.out.println("please input side3 ");
        double side3 = scanner.nextDouble();

        String retString;
        System.out.println(TriangleSquareCheck.Check(side1, side2, side3));
    }


}
