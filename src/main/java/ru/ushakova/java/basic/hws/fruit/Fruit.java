package ru.ushakova.java.basic.hws.fruit;

public abstract class Fruit {

    protected float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeightOfOneFruit() {
        return weight;
    }

    @Override
    public String toString() {
        return "Fruit" +
                " weight=" + weight;
    }

}