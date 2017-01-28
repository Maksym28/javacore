package com.Maksym28.runners.homework.lesson4;

import com.Maksym28.app.homework.lesson4.OddEven;

import java.util.Scanner;

/**
 * Created by lobenko on 26.01.2017.
 */
public class runnerOddEven {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("OddEven: this utility checks if the number you've entered is odd or even");

        System.out.println("please input number ");
        int number1 = scanner.nextInt();
        System.out.println(OddEven.Check(number1));


    }


}
