package com.Maksym28.app.classwork.lesson2;

/**
 * Created by lobenko on 19.01.2017.
 */
public class NarrowingCasting {
int int1 = 0;
float float1 = 3.13425f;

public void narroving(){
    int1 =  (int) float1;
    System.out.println(int1);
}

    public static void main(String[] args) {
        NarrowingCasting narrowingCasting= new NarrowingCasting();
        narrowingCasting.narroving();

    }
}

