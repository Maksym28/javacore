package com.Maksym28.app.classwork.lesson5;

import com.Maksym28.app.classwork.lesson3.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by lobenko on 30.01.2017.
 */

@RunWith(JUnitParamsRunner.class)
public class ParametrizedTests {
    public MathFunc mathFunc;

    @Before
    public void setUpClass(){
        mathFunc = new MathFunc();
    }

    @Test
    @FileParameters(value = "src/test/Resources/multiplydata.csv", mapper = CsvWithHeaderMapper.class)
    public void multiplyTest (int a , int b, int expected)
    {
        Assert.assertEquals(expected, mathFunc.multiply(a,b));
    }

}
