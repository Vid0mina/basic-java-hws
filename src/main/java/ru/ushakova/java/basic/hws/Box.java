package ru.ushakova.java.basic.hws;

import ru.ushakova.java.basic.hws.fruit.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruits;

    public Box(T... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public float weight() {
        return fruits.size() == 0 ? 0.0f : fruits.size() * fruits.get(0).getWeightOfOneFruit();
    }

    public void addFruit(T... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }

    public void addFruit(T fruit) {
        this.fruits.add(fruit);
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.weight() - anotherBox.weight()) < 0.0001;
    }

    public void pourFruit(Box<? super T> anotherBox) {
        if (this == anotherBox) return;
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();

    }

    public List<T> getFruitsBox() {
        return fruits;
    }

    @Override
    public String toString() {
        return "fruitsBox=" + fruits;
    }

}