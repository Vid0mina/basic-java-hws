package ru.ushakova.java.basic.hws.human;

import ru.ushakova.java.basic.hws.movement.Movement;

public class Human implements Movement {

    protected String name;
    protected String currentTransport;
    protected String power;

    public Human(String name, String currentTransport) {
        this.name = name;
        this.currentTransport = currentTransport;
    }

    public String getName() {
        return name;
    }

    public String getCurrentTransport() {
        return currentTransport;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public void move(Integer distance, String typeTerrain) {

    }

}
