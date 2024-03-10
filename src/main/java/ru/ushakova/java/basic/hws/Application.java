package ru.ushakova.java.basic.hws;

import ru.ushakova.java.basic.hws.enumerated.Terrain;
import ru.ushakova.java.basic.hws.human.Human;
import ru.ushakova.java.basic.hws.transport.*;

public class Application {
    public static void main(String[] args) {

        Transport car = new Car("автомобиль", 600);
        Transport bicycle = new Bicycle("велосипед");
        Transport horse = new Horse("лошадь", 400);
        Transport allTerrainVehicle = new AllTerrainVehicle("вездеход", 700);

        Human human = new Human("Артур Дент", 200);
        human.getCurrentTransport();
        human.getOnTheTransport(car);
        human.getCurrentTransport();
        human.getOnTheTransport(horse);
        human.getOffTheTransport();
        human.getOnTheTransport(car);
        human.move(100, Terrain.PLAIN);
        human.getOffTheTransport();
        human.getOnTheTransport(bicycle);
        human.move(100, Terrain.PLAIN);

    }

}