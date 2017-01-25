package com.Maksym28.app.classwork.lesson2;

/**
 * Created by lobenko on 19.01.2017.
 */


public class WideningCasting {
    public static void MathFunc(String[] args) {
        WideningCasting wideningCasting = new WideningCasting();
        wideningCasting.widening();
    }
    byte byte1 = 127;
    short short1 = 0;
    int int1 = 0;
    long long1 = 0L;
    float float1 = 0.0f;
    double double1 = 0.0d;
    // correct coversion bla bla bla
    public void widening()
    {
    double1 = float1 = long1 = int1 = short1 = byte1;
    System.out.println(double1);

    }

}
