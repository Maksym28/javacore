package com.Maksym28.app.homework.lesson6;

import java.util.Arrays;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by lobenko on 02.02.2017.
 */
public class firstarray {
public static void main(String[] args){
    int[] intArray = {1,2,3};
    for (int i=0; i<intArray.length; i++)
        System.out.println(intArray[i]);

    boolean[] bArray = {TRUE,FALSE,FALSE};
    for (int i=0; i<bArray.length; i++)
        System.out.println(bArray[i]);

    String[] chArray = {"TRUE","FALSE","FALSE"};
    for (int i=0; i<chArray.length; i++)
        System.out.println(chArray[i]);

    for (int arrElement : intArray)
        System.out.println(arrElement);

    double[] dArray = {3.14d,5.20d,11d};
    for (double arrElement : dArray)
        System.out.println(arrElement);

    System.out.println(Arrays.toString(intArray));
    System.out.println(Arrays.toString(dArray));

    int[][] fintArray = new int[2][3];
    for (int j=0; j<fintArray.length; j++) {
    for (int k=0; k<fintArray[j].length; k++)
    {
        fintArray[j][k] = j*k;
        System.out.println(fintArray[j][k]);
    }
    }
    }
}


