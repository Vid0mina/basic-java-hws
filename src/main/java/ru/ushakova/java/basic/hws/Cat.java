package ru.ushakova.java.basic.hws;

public class Cat {

    protected String name;
    protected Boolean isHungry;
    protected Integer appetite;

    public Cat(String name, Integer appetite) {
        this.name = name;
        this.isHungry = true;
        this.appetite = appetite;
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
            if (plate.reduceFood(appetite)) {
                isHungry = false;
                System.out.println(name + " поел.");
            } else System.out.println(name + " не поел.");
        } else {
            System.out.println(name + " не голоден.");
        }
    }

}
