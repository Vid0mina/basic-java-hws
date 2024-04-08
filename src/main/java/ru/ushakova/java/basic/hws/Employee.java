package ru.ushakova.java.basic.hws;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    protected final String name;

    protected final Integer age;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public static List<String> getEmployeeNames(List<Employee> employees) {
        if (employees == null || employees.isEmpty())
            throw new RuntimeException("На вход пришёл пустой объект/список.");
        List<String> names = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            names.add(employees.get(i).getName());
        }
        System.out.println(names);
        return names;
    }

    public static List<Employee> compareAge(List<Employee> employees, int minAge) {
        if (employees == null || employees.isEmpty())
            throw new RuntimeException("На вход пришёл пустой объект/список.");

        for (int i = 0; i < employees.size(); i++) {
            int age = employees.get(i).getAge();
            if (age >= minAge) {
                System.out.println(employees.get(i));
            }
        }
        return employees;
    }

    public static Integer checkAvgAge(List<Employee> employees, int avgAge) {
        int sum = 0;
        for (int i = 0; i < employees.size(); i++) {
            int age = employees.get(i).getAge();
            sum += age;
        }
        int result = sum / employees.size();
        if (result > avgAge) {
            System.out.println("Средний возраст сотрудников " + result + " превышает указанный аргумент " + avgAge + ".");
        } else
            System.out.println("Средний возраст сотрудников " + result + " НЕ превышает указанный аргумент " + avgAge + ".");
        return result;
    }

    public static Employee getYoungestEmployee(List<Employee> employees) {
        if (employees == null || employees.isEmpty())
            throw new RuntimeException("На вход пришёл пустой объект/список.");
        Employee emplLink = null;
        for (Employee employee : employees) {
            if (emplLink == null || employee.getAge() < emplLink.getAge()) emplLink = employee;
        }
        System.out.println("Самый молодой сотрудник >> " + emplLink);
        return emplLink;
    }

    @Override
    public String toString() {
        return "| Сотрудник | " + "имя: " + name + " | возраст: " + age;
    }

}