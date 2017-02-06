package com.Maksym28.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by lobenko on 29.01.2017.
 */
public class TestsLargerNumber {
@Test
    public void LargerNumberTest1() {
        double numberA = 10;
        double numberB = 10;
        double delta = 0.0005;
        String expResult = "You tricky bitch!";

                Assert.assertEquals(expResult, LargerNumber.Check(numberA, numberB));
                                    }
    @Test
    public void LargerNumberTest2() {
        double numberA = 0.0001;
        double numberB = 0.0001;
        double delta = 0.0005;
        String expResult = "You tricky bitch!";

        Assert.assertEquals(expResult, LargerNumber.Check(numberA, numberB));
    }
    @Test
    public void LargerNumberTest3() {
        double numberA = 0.0002;
        double numberB = 0.0001;
        double delta = 0.0005;
        String expResult = "Number A = " + numberA + " is bigger than Number B = " + numberB;

        Assert.assertEquals(expResult, LargerNumber.Check(numberA, numberB));
    }
    @Test
    public void LargerNumberTest4() {
        double numberA = 0.0002;
        double numberB = 0.00055;
        double delta = 0.0005;
        String expResult = "Number B = " + numberB + " is bigger than Number A = " + numberA;

        Assert.assertEquals(expResult, LargerNumber.Check(numberA, numberB));
    }
 @Test
    public void LargerNumberTest5() {
        double numberA = 99;
        double numberB = 100;
        double delta = 0.0005;
        String expResult = "Number B = " + numberB + " is bigger than Number A = " + numberA;

        Assert.assertEquals(expResult, LargerNumber.Check(numberA, numberB));
    }
    @Test
    public void LargerNumberTest6() {
        double numberA = 99;
        double numberB = 2;
        double delta = 0.0005;
        String expResult = "Number A = " + numberA + " is bigger than Number B = " + numberB;

        Assert.assertEquals(expResult, LargerNumber.Check(numberA, numberB));
    }

        }