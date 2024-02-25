package ru.ushakova.java.basic.hws.transport;

import ru.ushakova.java.basic.hws.movement.Movement;

public class Bicycle implements Movement {
    @Override
    public Boolean move(Integer distance, String typeTerrain) {
        return true;

    }

}
