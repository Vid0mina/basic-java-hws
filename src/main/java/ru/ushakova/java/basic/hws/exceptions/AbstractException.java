package ru.ushakova.java.basic.hws.exceptions;

public abstract class AbstractException extends RuntimeException {

    protected String message;

    public AbstractException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
