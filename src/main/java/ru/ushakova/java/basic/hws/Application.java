package ru.ushakova.java.basic.hws;

import ru.ushakova.java.basic.hws.fruit.Apple;
import ru.ushakova.java.basic.hws.fruit.Fruit;
import ru.ushakova.java.basic.hws.fruit.Orange;

public class Application {

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(new Apple());
        Box<Orange> orangeBox = new Box<>(new Orange());
        Box<Orange> orangeBox2 = new Box<>(new Orange());
        Box<Fruit> diffFruit = new Box<>();

        orangeBox.pourFruit(diffFruit);
        orangeBox.pourFruit(orangeBox2);
        appleBox.pourFruit(diffFruit);

        System.out.println(diffFruit);
        System.out.println(diffFruit.compare(appleBox));
    }

}