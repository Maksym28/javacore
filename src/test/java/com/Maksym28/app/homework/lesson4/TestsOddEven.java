package com.Maksym28.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by lobenko on 29.01.2017.
 */
public class TestsOddEven {
@Test
    public void OddEvenTest1() {
        int numberA = 10;

        String expResult = "Number is even";

                Assert.assertEquals(expResult, OddEven.Check(numberA));
                                    }
    @Test
    public void OddEvenTest2() {
        int numberA = 11;

        String expResult = "Number is odd";

        Assert.assertEquals(expResult, OddEven.Check(numberA));
    }
        }