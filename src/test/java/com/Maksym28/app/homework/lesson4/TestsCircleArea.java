package com.Maksym28.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by lobenko on 29.01.2017.
 */
public class TestsCircleArea {
@Test
    public void circleareaTest1() {
        double radius = 10;
        double expResult = 314.1592;
        double delta = 0.02;
                Assert.assertEquals(expResult, CircleArea.calculate(radius), delta);
    }
    @Test
    public void circleareaTest2() {
        double radius = 100;
        double expResult = 3141.592;
        double delta = 0.02;
        Assert.assertNotEquals(expResult, CircleArea.calculate(radius), delta);
    }
    @Test
    public void circleareaTest3() {
        double radius = 0.01;
        double expResult = 0.0003141592;
        double delta = 0.000000002;
        Assert.assertEquals(expResult, CircleArea.calculate(radius), delta);
    }

        }


