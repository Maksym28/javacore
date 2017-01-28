package com.Maksym28.runners.homework.lesson4;

import java.util.Scanner;

/**
 * Created by lobenko on 26.01.2017.
 */
class Lesson4Runner {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        for (int choice = 6; choice != 0; choice++) {
            System.out.println("Welcome to FastUtils, please select ");
            System.out.println("1 - Calculate circle area ");
            System.out.println("2 - compare areas of two circles ");
            System.out.println("3 - determine which number is larger");
            System.out.println("4 - determine if you number is odd or even ");
            System.out.println("5 - determine if set of 3 numbers could make the sides of square triangle ");
            System.out.println("0 - Quit the FastUtils ");

           /** String input = scanner.toString();
            char inpchar = input.charAt(0);
            choice = (int) inpchar;
            choice = choice - 30;
            */
           choice = scanner.nextInt();

            if (choice == 1)
                runnerCircleArea.main();
            else if (choice == 2)
                runnerCircleAreaCompare.main();
            else if (choice == 3)
                runnerLargerNumber.main();
            else if (choice == 4)
                runnerOddEven.main();
            else if (choice == 5)
                runnerTriangleSquareCheck.main();
            else if (choice == 0)
                return;
            else
                System.out.println("Please confirm your selection by entering number from 0 to 5");


        }
    }
}





