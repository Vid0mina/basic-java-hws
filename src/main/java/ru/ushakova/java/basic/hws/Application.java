package ru.ushakova.java.basic.hws;

public class Application {
    public static void main(String[] args) {

        Animal cat = new Cat("Матроскин", 48, 0, 15);
        Animal dog = new Dog("Баскервилей", 48, 5, 30);
        Animal horse = new Dog("Росинант", 71, 10, 50);

        cat.info();
        cat.run(6);
        cat.swim(4);
        cat.run(9);

        System.out.println();

        dog.info();
        dog.run(6);
        dog.swim(4);
        dog.run(9);
        dog.run(7);

        System.out.println();

        horse.info();
        horse.run(16);
        horse.swim(4);
        horse.run(9);
        horse.run(34);

    }

}