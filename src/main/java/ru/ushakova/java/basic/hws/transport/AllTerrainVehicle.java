package ru.ushakova.java.basic.hws.transport;

import ru.ushakova.java.basic.hws.enumerated.Terrain;

public class AllTerrainVehicle extends Transport {

    public AllTerrainVehicle(String transportName, Integer power) {
        super(transportName, power);
    }

    @Override
    public Boolean move(Integer distance, Terrain terrain) {
        Boolean result = power >= distance;
        if (result) {
            switch (terrain) {
                case DENSE_FOREST, SWAMP, PLAIN:
                    power = power - distance;
                    System.out.println("Сил осталось " + power + ". Вездеход проехал " + distance);
                    break;
                default:
                    System.out.println("Вездеход не проедет.");
                    break;
            }
        } else {
            System.out.println("Недостаточно топлива.");
        }
        return result;
    }

}