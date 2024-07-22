package ru.ushakova.java.basic.hws;

import lombok.NonNull;

import java.util.*;

public class PersonDataBase {

    List<Person> personsList = new ArrayList<>(Arrays.asList(
            new Person("Murzik", Position.JUNIOR_DEVELOPER, 1L),
            new Person("Pushok", Position.QA, 2L),
            new Person("Musya", Position.DIRECTOR, 7L),
            new Person("Barsik", Position.SENIOR_MANAGER, 11L),
            new Person("Bagira", Position.BRANCH_DIRECTOR, 8L)
    ));
    LinkedList<Person> personsLinkedList = new LinkedList<>(Arrays.asList(
            new Person("Murzik", Position.JUNIOR_DEVELOPER, 1L),
            new Person("Pushok", Position.QA, 2L),
            new Person("Musya", Position.DIRECTOR, 7L),
            new Person("Barsik", Position.SENIOR_MANAGER, 11L),
            new Person("Bagira", Position.BRANCH_DIRECTOR, 8L)
    ));
    Set<Person> personSet = new HashSet<>(Arrays.asList(
            new Person("Murzik", Position.JUNIOR_DEVELOPER, 1L),
            new Person("Pushok", Position.QA, 2L),
            new Person("Musya", Position.DIRECTOR, 7L),
            new Person("Barsik", Position.SENIOR_MANAGER, 11L),
            new Person("Bagira", Position.BRANCH_DIRECTOR, 8L)
    ));

    Person findById(@NonNull Long id) {
        for (Person p : personSet) {
            if (p.getId().equals(id)) return p;

        }
        return null;
    }

    void add(@NonNull Person person) {
        personsLinkedList.addFirst(person);
        System.out.println(personsLinkedList);
    }

    Boolean isManager(@NonNull Person person) {
        for (Person p : personsList) {
            if (p.getPosition().getLevelCode() == 1) return true;
        }
        return false;
    }

    Boolean isEmployee(@NonNull Long id) {
        for (Person p : personsList) {
            if (p.getId() == id) {
                if (p.getPosition().getLevelCode() == 0) return true;
            }
        }
        return false;
    }

}
