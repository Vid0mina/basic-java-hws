package ru.ushakova.java.basic.hws.transport;

import ru.ushakova.java.basic.hws.enumerated.Terrain;

public class Horse extends Transport {

    public Horse(String transportName, Integer power) {
        super(transportName, power);
    }

    @Override
    public Boolean move(Integer distance, Terrain terrain) {
        Boolean result = power >= distance;
        if (result) {
            switch (terrain) {
                case SWAMP:
                    System.out.println("Лошадь не пройдёт.");
                    break;
                case PLAIN, DENSE_FOREST:
                    power = power - distance;
                    System.out.println("Сил осталось " + power + ". Лошадь прошла " + distance);
                    break;
            }
        } else {
            System.out.println("Недостаточно сил.");
        }
        return result;
    }

}