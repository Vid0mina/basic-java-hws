package ru.ushakova.java.basic.hws;

public class Application {

    public static void main(String[] args) {
        Plate plate = new Plate(10);
        Cat[] cats = {
                new Cat("Салем", 2000),
                new Cat("Пушок", 1),
                new Cat("Матроскин", 8),
                new Cat("Кузя", 4)
        };

        cats[1].setAppetite(false);

        for (Cat cat : cats) {
            cat.eat(plate);
            plate.info();
        }
    }

}