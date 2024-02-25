package ru.ushakova.java.basic.hws.transport;

import ru.ushakova.java.basic.hws.movement.Movement;

public class AllTerrainVehicle implements Movement {

    protected Integer fuel;

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    @Override
    public void move(Integer distance, String typeTerrain) {

    }

}