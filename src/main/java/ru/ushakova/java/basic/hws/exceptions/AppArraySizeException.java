package ru.ushakova.java.basic.hws.exceptions;

public class AppArraySizeException extends AbstractException {

    public AppArraySizeException() {
        super("Несоответствие ожидаемой размерности массива.");
    }

}