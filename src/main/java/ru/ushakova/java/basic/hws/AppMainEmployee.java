package ru.ushakova.java.basic.hws;

import java.util.ArrayList;
import java.util.List;

import static ru.ushakova.java.basic.hws.Employee.*;

public class AppMainEmployee {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Готфрид Лейбниц", 30),
                new Employee("Блез Паскаль", 45),
                new Employee("Анри Пуанкаре", 33),
                new Employee("Якоб Бернулли", 28)
        ));

        getEmployeeNames(employees);
        compareAge(employees, 33);
        checkAvgAge(employees, 38);
        getYoungestEmployee(employees);
    }

}