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
    Map<Long, Person> personMap = new HashMap<>(Map.of(
            1L, new Person("Murzik", Position.JUNIOR_DEVELOPER),
            2L, new Person("Pushok", Position.QA),
            7L, new Person("Musya", Position.DIRECTOR),
            11L, new Person("Barsik", Position.SENIOR_MANAGER),
            8L, new Person("Bagira", Position.BRANCH_DIRECTOR)
    ));

    Person findById(@NonNull Long id) {
        for (Map.Entry<Long, Person> entry : personMap.entrySet()) {
            if (entry.getKey().equals(id)) return entry.getValue();
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
