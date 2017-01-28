package com.Maksym28.runners.homework.lesson4;

import com.Maksym28.app.homework.lesson4.CircleArea;

import java.util.Scanner;

/**
 * Created by lobenko on 26.01.2017.
 */
public class runnerCircleArea {

    public static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("CircleArea: this utility calculates circle area by the radius.");

        System.out.println("please input circle radius");
        double radius = scanner.nextDouble();
        System.out.println("Area is " + CircleArea.calculate(radius));

    }


}
