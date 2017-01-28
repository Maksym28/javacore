package com.Maksym28.runners.homework.lesson4;

import com.Maksym28.app.homework.lesson4.LargerNumber;

import java.util.Scanner;

/**
 * Created by lobenko on 26.01.2017.
 */
public class runnerLargerNumber {

    public static void main() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("LargerNumber:This utility compares two numbers number A and number B");

        System.out.println("please input number A");
        double numberA = scanner.nextInt();

        System.out.println("please input number B");
        double numberB = scanner.nextInt();



        System.out.println(LargerNumber.Check(numberA, numberB));
    }


}
