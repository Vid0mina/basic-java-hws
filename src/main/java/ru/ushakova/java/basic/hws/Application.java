package ru.ushakova.java.basic.hws;

public class Application {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Карл Теодор Вильгельм Вейерштрасс", "8800200600");
        phoneBook.add("Жозеф Луи Лагранж", "77777777"); //8810777777
        phoneBook.add("Николай Иванович Лобачевский", "8810777777");
        phoneBook.add("Николай Иванович Лобачевский", "88159354421");

        System.out.println(phoneBook);

        phoneBook.find("Николай Иванович Лобачевский");
        phoneBook.find("Джейн Доу");

        System.out.println(phoneBook.containsPhoneNumber("8800200600"));

        System.out.println(phoneBook.containsPhoneNumber("8800200666"));

    }

}