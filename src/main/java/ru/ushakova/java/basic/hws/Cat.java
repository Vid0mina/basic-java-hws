package ru.ushakova.java.basic.hws;

public class Cat {

    protected String name;
    protected Boolean isHungry;

    public Cat(String name) {
        this.name = name;
        this.isHungry = true;
    }

    public String getName() {
        return name;
    }

    public Boolean getAppetite() {
        return isHungry;
    }

    public void setAppetite(Boolean appetite) {
        if (appetite == null) return;
        this.isHungry = appetite;
    }

    public void eat(Plate plate) {
        if (isHungry) {
            if (plate.reduceFood(4)) {
                isHungry = false;
                System.out.println(name + " поел.");
            } else System.out.println(name + " не поел.");
        } else {
            System.out.println(name + " не голоден.");
        }
    }

}
