package ru.ushakova.java.basic.hws.transport;

import ru.ushakova.java.basic.hws.movement.Movement;

public class Horse implements Movement {
    protected Integer power;

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Override
    public void move(Integer distance, String typeTerrain) {

    }

}