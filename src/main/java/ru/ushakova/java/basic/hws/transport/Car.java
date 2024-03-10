package ru.ushakova.java.basic.hws.transport;

import ru.ushakova.java.basic.hws.enumerated.Terrain;

public class Car extends Transport {

    public Car(String transportName, Integer power) {
        super(transportName, power);
    }

    @Override
    public Boolean move(Integer distance, Terrain terrain) {
        Boolean result = power >= distance;
        if (result) {
            switch (terrain) {
                case DENSE_FOREST, SWAMP:
                    System.out.println("Автомобиль не проедет.");
                    break;
                case PLAIN:
                    power = power - distance;
                    System.out.println("Сил осталось " + power + ". Автомобиль проехал " + distance);
                    break;
            }
        } else {
            System.out.println("Недостаточно топлива.");
        }
        return result;
    }

}
