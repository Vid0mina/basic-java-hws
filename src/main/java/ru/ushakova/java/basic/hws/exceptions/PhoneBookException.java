package ru.ushakova.java.basic.hws.exceptions;

public class PhoneBookException extends AbstractException {

    public PhoneBookException() {
        super("На вход пришёл пустой объект/список.");
    }

}