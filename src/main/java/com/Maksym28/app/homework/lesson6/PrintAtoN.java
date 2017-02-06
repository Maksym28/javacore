package com.Maksym28.app.homework.lesson6;

import java.util.Scanner;

/**
 * Created by lobenko on 02.02.2017.
 */

    public class PrintAtoN {
        static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args)
        {
            System.out.println("This utility prints numbers from A to N");
            System.out.println("Enter A and press Enter");
         int initial=scanner.nextInt();
            System.out.println("Enter N and press Enter");
         int N=scanner.nextInt();
         N= N+1;
          int   a=initial;
            while (a<N)
            {
                System.out.println(" While A= "+a);
                a = a+1;
            }
        for (a=initial; a<N; a++)
            System.out.println("For A="+a);

            a=initial;
            do
            {
                System.out.println(" Do A= "+a);
                a=a+1;
            }
            while(a<N);
        }
    }

