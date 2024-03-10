package ru.ushakova.java.basic.hws.transport;

import ru.ushakova.java.basic.hws.enumerated.Terrain;
import ru.ushakova.java.basic.hws.human.Human;

public class Bicycle extends Transport {

    protected Human human;
    protected Boolean isPowerless = true;

    public Bicycle(String transportName) {
        super(transportName, 0);
    }

    @Override
    public Boolean getPowerless() {
        return isPowerless;
    }

    @Override
    public Boolean move(Integer distance, Terrain terrain) {
        Boolean result = power >= distance;
        if (result) {
            switch (terrain) {
                case SWAMP:
                    System.out.println("Велосипед не проедет.");
                    break;
                case PLAIN, DENSE_FOREST:
                    power = power - distance;
                    System.out.println("Сил осталось " + power + ". Велосипед проехал " + distance);
                    break;
            }
        } else {
            System.out.println("Велосипедист устал и дальше ехать не может.");
        }
        return result;
    }

}
