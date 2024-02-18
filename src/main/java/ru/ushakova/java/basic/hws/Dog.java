package ru.ushakova.java.basic.hws;

public class Dog extends Animal {

    public Dog(String name, Integer runningSpeed, Integer swimmingSpeed, Integer stamina) {
        super(name, runningSpeed, swimmingSpeed, stamina);
    }

    @Override
    public Integer swim(int distance) {
        stamina = stamina - distance * 2;
        if (stamina > 0) {
            System.out.println("Выносливость животного " + name + " составляет " + stamina + " единиц.");
            return distance / runningSpeed;
        } else {
            System.out.println("У животного " + name + " появилось состояние усталости");
            return -1;
        }
    }

}
