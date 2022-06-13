package lesson3;

import java.awt.*;
import java.util.Arrays;

public class MyApp {

    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();

        orangeBox.info();
        appleBox.info();

        orangeBox.add(new Orange("Апельсины", 250));
        orangeBox.add(new Orange("Апельсины", 250));

        appleBox.add(new Apple("Яблоки", 180));
        appleBox.add(new Apple("Яблоки", 180));
        appleBox.add(new Apple("Яблоки", 180));


        System.out.println(appleBox.compare(orangeBox));

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.moveFruitsFrom(orangeBox);
        orangeBox1.info();

        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.info();

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.moveFruitsFrom(appleBox);
        appleBox1.info();

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.info();
    }
}
