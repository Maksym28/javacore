package main.java.com.Maksym28.app.utils.convertors;

/**
 * Created by lobenko on 23.01.2017.
 */
public class PrimitiveConvertor {

    public void floatToChar(float floatToConvert){
        int intConverted =  (int) floatToConvert;
        System.out.println("Input float value is "+floatToConvert);
        System.out.println("Output Integer value is "+intConverted);
    }
    public void intToChar(int intToConvert){
        char charConverted =  (char) intToConvert;
        System.out.println("Input Integer value is "+intToConvert);
        System.out.println("Output char value is "+charConverted);
    }
    public void charToInt(char charToConvert){
        int intConverted =  (int) charToConvert;
        System.out.println("Input Char value is "+charToConvert);
        System.out.println("Output Integer value is "+intConverted);
    }

}
