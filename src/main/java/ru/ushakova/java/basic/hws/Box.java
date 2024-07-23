package ru.ushakova.java.basic.hws;

import ru.ushakova.java.basic.hws.fruit.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    private ArrayList<T> fruitsBox;

    public Box(T... fruits) {
        this.fruitsBox = new ArrayList<>(Arrays.asList(fruits));
    }

    public Box() {
        this.fruitsBox = new ArrayList<>();
    }

    public float weight() {
        return fruitsBox.size() == 0 ? 0.0f : fruitsBox.size() * fruitsBox.get(0).getWeightOfOneFruit();
    }

    public void addFruit(T... fruits) {
        this.fruitsBox.addAll(Arrays.asList(fruits));
    }

    public void addFruit(T fruit) {
        this.fruitsBox.add(fruit);
    }

    public boolean compare(Box<?> anotherBox) {
        if (this.weight() == anotherBox.weight()) return true;
        return false;
    }

    public void pourFruit(Box<? super T> anotherBox) {
        if (this == anotherBox) return;
        anotherBox.fruitsBox.addAll(this.fruitsBox);
        this.fruitsBox.clear();

    }

    public List<T> getFruitsBox() {
        return fruitsBox;
    }

    @Override
    public String toString() {
        return "fruitsBox=" + fruitsBox;
    }

}
