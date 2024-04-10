package ru.ushakova.java.basic.hws;

import ru.ushakova.java.basic.hws.exceptions.NameException;
import ru.ushakova.java.basic.hws.exceptions.NumberException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private final HashMap<String, HashSet<String>> phones;

    public PhoneBook() {
        phones = new HashMap<>();
    }

    public void add(String name, String number) {
        if (name == null) throw new NameException();
        if (number == null) throw new NumberException();
        if (phones.containsKey(name)) {
            phones.get(name).add(number);
        } else {
            phones.put(name, new HashSet<>(List.of(number)));
        }
    }

    public void find(String name) {
        if (name == null) throw new NameException();
        if (phones.containsKey(name)) {
            System.out.println("Результаты поиска по имени "+ name +" >> " + phones.get(name));
        } else {
            System.out.println("Контакт не найден.");
        }
    }

    public boolean containsPhoneNumber(String number) {
        if (number == null) throw new NumberException();
        for (Map.Entry<String, HashSet<String>> entry : phones.entrySet())  {
            if (entry.getValue().contains(number)) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Контакты >> \n" + phones;
    }

}
