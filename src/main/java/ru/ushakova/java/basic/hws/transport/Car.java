package ru.ushakova.java.basic.hws.transport;

import ru.ushakova.java.basic.hws.movement.Movement;

public class Car implements Movement {

    protected Integer fuel;

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    @Override
    public Boolean move(Integer distance, String typeTerrain) {
        Boolean result = fuel >= distance;
        System.out.println("Машина проехала " + distance);
        return result;

    }

}
