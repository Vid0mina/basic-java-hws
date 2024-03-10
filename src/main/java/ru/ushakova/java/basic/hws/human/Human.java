package ru.ushakova.java.basic.hws.human;

import ru.ushakova.java.basic.hws.enumerated.Terrain;
import ru.ushakova.java.basic.hws.movement.Movement;
import ru.ushakova.java.basic.hws.transport.Transport;

public class Human implements Movement {

    protected String name;
    protected Transport currentTransport;
    protected Integer power;

    public Human(String name, Integer power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public Transport getCurrentTransport() {
        if (currentTransport != null) {
            System.out.println("Текущий транспорт пользователя " + currentTransport);
        } else {
            System.out.println(name + " идёт пешком.");
        }
        return currentTransport;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "name = '" + name + '\'' +
                ", currentTransport = " + currentTransport +
                ", power = " + power;
    }

    @Override
    public Boolean move(Integer distance, Terrain terrain) {
        Boolean result = power >= distance;
        if (currentTransport != null) {
            currentTransport.move(distance, terrain);
        } else {
            if (result) {
                power = power - distance;
                System.out.println(name + " идёт пешком. " + "Сил осталось " + power + ". Расстояние прошёл " + distance);
            } else {
                System.out.println("Сил не хватает идти пешком.");
            }
        }
        return result;
    }

    public void getOnTheTransport(Transport transport) {
        if (this.currentTransport == null) {
            this.currentTransport = transport;
            if (transport.getPowerless()) {
                transport.setPower(power);
            }
            System.out.println(name + " пересел на транспортное средство " + transport);
        } else {
            System.out.println(name + " уже сидит в " + this.currentTransport + " Сначала нужно слезть с текущего транспорта.");
        }
    }

    public void getOffTheTransport() {
        System.out.println(name + " покинул транспортное средство " + currentTransport);
        currentTransport = null;
    }

}