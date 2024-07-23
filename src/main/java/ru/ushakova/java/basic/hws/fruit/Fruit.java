package ru.ushakova.java.basic.hws.fruit;

public abstract class Fruit {

    protected float weightOfOneFruit;

    public Fruit(float weight) {
        this.weightOfOneFruit = weight;
    }

    public float getWeightOfOneFruit() {
        return weightOfOneFruit;
    }

    @Override
    public String toString() {
        return "Fruit" +
                " weight=" + weightOfOneFruit;
    }

}