package ru.ushakova.java.basic.hws.transport;

import ru.ushakova.java.basic.hws.enumerated.Terrain;
import ru.ushakova.java.basic.hws.movement.Movement;

public abstract class Transport implements Movement {

    protected Integer power;
    protected String transportName;
    protected Boolean isPowerless = false;

    public Transport(String transportName, Integer power) {
        this.power = power;
        this.transportName = transportName;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        if (power >= 0 && power != null) {
            this.power = power;
        }
    }

    public Boolean getPowerless() {
        return isPowerless;
    }

    public abstract Boolean move(Integer distance, Terrain terrain);

    @Override
    public String toString() {
        return transportName +
                " (сила = " + power + ").";
    }

}
