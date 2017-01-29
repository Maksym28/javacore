package com.Maksym28.app.homework.lesson4;

import org.junit.Assert;
import org.testng.annotations.Test;

/**
 * Created by lobenko on 29.01.2017.
 */
public class TestsTriangleSquareCheck {
    @Test
    public void TriangleSquareCheckTest1() {
        double side1 = 10;
        double side2 = 6;
        double side3 = 8;
        String expResult = "Triangle is Right angled";

        Assert.assertEquals(expResult, TriangleSquareCheck.Check(side1, side2, side3));
    }
        @Test
        void TriangleSquareCheckTest2() {
            double side1 = 10;
            double side2 = 8;
            double side3 = 6;
            String expResult = "Triangle is Right angled";

            Assert.assertEquals(expResult, TriangleSquareCheck.Check(side1, side2, side3));
        }
         @Test
          void TriangleSquareCheckTest3() {
             double side1 = 8;
             double side2 = 6;
             double side3 = 10;
              String expResult = "Triangle is Right angled";

             Assert.assertEquals(expResult, TriangleSquareCheck.Check(side1, side2, side3));
    }
        @Test
        void TriangleSquareCheckTest4() {
            double side1 = 8;
            double side2 = 6;
            double side3 = 6;
            String expResult = "Triangle could not be Right Angled";

            Assert.assertEquals(expResult, TriangleSquareCheck.Check(side1, side2, side3));
    }
        @Test
        void TriangleSquareCheckTest5() {
            double side1 = 0.8d;
            double side2 = 0.6d;
            double side3 = 0.1d;
            String expResult = "Triangle is Right angled";

            Assert.assertEquals(expResult, TriangleSquareCheck.Check(side1, side2, side3));
        }
}