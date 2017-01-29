package com.Maksym28.app.homework.lesson4;

import org.junit.Assert;
import org.testng.annotations.Test;

/**
 * Created by lobenko on 29.01.2017.
 */
public class TestsCircleAreaCompare {
@Test
    public void circleareaTest1() {
        double radius1 = 11;
        double radius2 = 10;
        String expResult = "Area of circle 1 is bigger";

                Assert.assertEquals(expResult, CircleAreaCompare.Compare(radius1, radius2));
                                    }


    @Test
    public void circleareaTest2() {
        double radius1 = 10;
        double radius2 = 15;
        String expResult = "Area of circle 2 is bigger";

        Assert.assertEquals(expResult, CircleAreaCompare.Compare(radius1, radius2));
    }

    @Test
    public void circleareaTest3() {
        double radius1 = 110;
        double radius2 = 110;
        String expResult = "Area of circle 1 is equal to area of circle 2";

        Assert.assertEquals(expResult, CircleAreaCompare.Compare(radius1, radius2));
        }
    @Test
    public void circleareaTest4() {
        double radius1 = 0.1;
        double radius2 = 0.5;
        String expResult = "Area of circle 2 is bigger";

        Assert.assertEquals(expResult, CircleAreaCompare.Compare(radius1, radius2));
    }


    @Test
    public void circleareaTest5() {
        double radius1 = 0.877;
        double radius2 = 0.114;
        String expResult = "Area of circle 1 is bigger";

        Assert.assertEquals(expResult, CircleAreaCompare.Compare(radius1, radius2));
    }

    @Test
    public void circleareaTest6() {
        double radius1 = 0.0030;
        double radius2 = 0.0030;
        String expResult = "Area of circle 1 is equal to area of circle 2";

        Assert.assertEquals(expResult, CircleAreaCompare.Compare(radius1, radius2));
    }
        }