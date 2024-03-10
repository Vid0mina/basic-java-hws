package ru.ushakova.java.basic.hws.movement;

import ru.ushakova.java.basic.hws.enumerated.Terrain;

public interface Movement {

    Boolean move(Integer distance, Terrain terrain);

}