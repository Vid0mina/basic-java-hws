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
        for (Employee emp:employees) {
            names.add(emp.getName());
        }
        System.out.println(names);
        return names;
    }

    public static List<Employee> compareAge(List<Employee> employees, int minAge) {
        if (employees == null || employees.isEmpty())
            throw new RuntimeException("На вход пришёл пустой объект/список.");
        List<Employee> sortedEmployees = new ArrayList<>();

        for (Employee emp:employees) {
            int age = emp.getAge();
            if (age >= minAge) {
                sortedEmployees.add(emp);
                System.out.println(emp);
            }
        }
        return sortedEmployees;
    }

    public static boolean checkAvgAge(List<Employee> employees, double avgAge) {
        double sum = 0;
        for (Employee emp:employees) {
            sum += emp.getAge();
        }
        double result = sum / employees.size();
        if (result > avgAge) {
            System.out.println("Средний возраст сотрудников " + result + " превышает указанный аргумент " + avgAge + ".");
            return true;
        } else
            System.out.println("Средний возраст сотрудников " + result + " НЕ превышает указанный аргумент " + avgAge + ".");
        return false;
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