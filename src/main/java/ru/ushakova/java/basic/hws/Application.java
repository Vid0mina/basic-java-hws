package ru.ushakova.java.basic.hws;

import ru.ushakova.java.basic.hws.hw4.Box;
import ru.ushakova.java.basic.hws.hw4.User;

import java.time.Year;

public class Application {

    public static void main(String[] args) {

        User[] users = {
                new User("Тейлор", "Ричард", "Тейлор", 1970, "psychiatrist@gmail.com"),
                new User("Лавкрафт", "Ховард", "Филлипс", 1990, "kadath@gmail.com"),
                new User("Дик", "Филип", "Киндред", 1998, "ubik@gmail.com"),
                new User("Сапковский", "Анджей", "Анджей", 1948, "plotva@gmail.com"),
                new User("Сэлинджер", "Джером", "Дэвид", 1999, "Rye@gmail.com"),
                new User("Адамс", "Дуглас", "Ноэль", 1952, "SoLongandThanksforalltheFish@gmail.com"),
                new User("Драйзер", "Теодор", "Херман", 1971, "sister@gmail.com"),
                new User("Воннегут", "Курт", "Курт", 2001, "TheSirensofTitan@gmail.com"),
                new User("Брэдбери", "Рэй", "Дуглас", 1995, "ubik@gmail.com"),
                new User("Чехов", "Антон", "Павлович", 1960, "step@gmail.com")
        };

        for (User user : users) {
            Integer currentYear = Year.now().getValue();
            Integer birthYear = user.getBirthYear();
            if (currentYear - birthYear > 40) {
                //System.out.println(user.showInfo());
            }
        }

        Box box = new Box(5, "голубой");
        Boolean isOpen = box.isOpen(true);
        box.getColor();
        box.getSize();
        box.setColor("красный");
        box.setStuff("мышь", isOpen);
        box.throwAwayStuff(isOpen);
        box.setStuff("крыса", isOpen);
        System.out.println(box.showBoxInfo());
    }

}