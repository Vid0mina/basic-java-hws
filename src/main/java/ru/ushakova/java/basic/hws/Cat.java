package ru.ushakova.java.basic.hws;

public class Cat extends Animal {

    public Cat(String name, Integer runningSpeed, Integer swimmingSpeed, Integer stamina) {
        super(name, runningSpeed, swimmingSpeed, stamina);
    }

    @Override
    public Integer swim(int distance) {
        System.out.println("Кот никуда не поплывёт, он не умеет.");
        return -1;
    }

}