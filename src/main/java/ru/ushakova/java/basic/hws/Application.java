package ru.ushakova.java.basic.hws;

public class Application {
    public static void main(String[] args) {

        Plate plate = new Plate(10);
        Cat[] cats = {
                new Cat("Салем"),
                new Cat("Пушок"),
                new Cat("Матроскин"),
                new Cat("Кузя")
        };

        cats[1].setAppetite(false);

        for (Cat cat : cats) {
            cat.eat(plate);
        }
    }

}