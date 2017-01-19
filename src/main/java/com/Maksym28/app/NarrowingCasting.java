package main.java.com.Maksym28.app;

/**
 * Created by lobenko on 19.01.2017.
 */
public class NarrowingCasting {
int int1 = 127;
float float1 = 0.0f;

public void narroving(){
    float1 = int1;
    System.out.println(float1);
}

    public static void main(String[] args) {
        NarrowingCasting narrowingCasting= new NarrowingCasting();
        narrowingCasting.narroving();

    }
}

