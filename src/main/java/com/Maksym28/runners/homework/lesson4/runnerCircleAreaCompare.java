package com.Maksym28.runners.homework.lesson4;


import com.Maksym28.app.homework.lesson4.CircleAreaCompare;

import java.util.Scanner;

/**
 * Created by lobenko on 26.01.2017.
 */
public class runnerCircleAreaCompare {


    public static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("CircleAreaCompare: this utility compares areas of two circles by the radiuses provided.");

        System.out.println("please input circle 1 radius");
        double radius1 = scanner.nextDouble();

        System.out.println("please input circle 2 radius");
        double radius2 = scanner.nextDouble();


            System.out.println( CircleAreaCompare.Compare(radius1, radius2));
    }


}
