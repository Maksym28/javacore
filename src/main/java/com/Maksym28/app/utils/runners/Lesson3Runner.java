package main.java.com.Maksym28.app.utils.runners;

import main.java.com.Maksym28.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by lobenko on 23.01.2017.
 */


public class Lesson3Runner {
    public static void main (String args[]){
    PrimitiveConvertor firstConvertor = new PrimitiveConvertor();
    firstConvertor.floatToChar(48848.2344f);
    firstConvertor.intToChar(112);
    firstConvertor.charToInt('F');
    }

}
