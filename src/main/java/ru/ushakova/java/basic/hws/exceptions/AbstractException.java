package ru.ushakova.java.basic.hws.exceptions;

public abstract class AbstractException extends RuntimeException {

    protected String message;

    public AbstractException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return message;
    }

}
