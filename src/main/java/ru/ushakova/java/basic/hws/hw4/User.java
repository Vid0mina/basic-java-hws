package ru.ushakova.java.basic.hws.hw4;

public class User {

    private final String surname;
    private final String name;
    private final String patronymic;
    private final Integer birthYear;
    private final String email;

    public User(String surname, String name, String patronymic, Integer birthYear, String email) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String showUserInfo() {
        return "ФИО: " + surname + " " + name + " " + patronymic + "\n" + "Год рождения: " + birthYear + "\n" + "e-mail: " + email + "\n";
    }

}
