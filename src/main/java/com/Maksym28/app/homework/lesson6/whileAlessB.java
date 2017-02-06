package com.Maksym28.app.homework.lesson6;
import java.util.Scanner;

/**
 * Created by lobenko on 02.02.2017.
 */
public class whileAlessB {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter A");
        int a= scanner.nextInt();
        System.out.println("Please enter B");
        int b = scanner.nextInt();

        while (a>b)
        {
            System.out.println("A= "+a+ " B = "+b);
            a = a-1;
        }
        System.out.println("Equality reached");
        System.out.println("A= "+a+ " B = "+b);
        a= a-1;
        System.out.println("A is currently less than B");
        System.out.println("A= "+a+ " B = "+b);

    }
    }

