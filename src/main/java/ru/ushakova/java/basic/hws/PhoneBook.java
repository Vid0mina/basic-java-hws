package ru.ushakova.java.basic.hws;

import ru.ushakova.java.basic.hws.exceptions.NameException;
import ru.ushakova.java.basic.hws.exceptions.NumberException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class PhoneBook {
    private final HashMap<String, HashSet<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String name, String number) {
        if (name == null) throw new NameException();
        if (number == null) throw new NumberException();
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(number);
        } else {
            phoneBook.put(name, new HashSet<>(List.of(number)));
        }
    }

    public void find(String name) {
        if (name == null) throw new NameException();
        if (phoneBook.containsKey(name)) {
            System.out.println("Результаты поиска по имени "+ name +" >> " + phoneBook.get(name));
        } else {
            System.out.println("Контакт не найден.");
        }
    }

    public boolean containsPhoneNumber(String number) {
        if (number == null) throw new NumberException();
        for (String k : phoneBook.keySet()) {
            if (phoneBook.get(k).contains(number)) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Контакты >> \n" + phoneBook;
    }

}
