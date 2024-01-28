package ru.ushakova.java.basic.hws.hw1;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println("*** Введите число от 1 до 5 ***");
        final Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        selectAction(a);
    }

    static void greetings() {
        String[] greets = {"Hello", "World", "from", "Java"};
        for (String greet : greets) {
            System.out.println(greet);
        }
    }

    private static void checkSign(int a, int b, int c) {
        int result = a + b + c;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void selectColor() {
        int data = 10;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() {
        int a = -7, b = 10;
        String line = (a >= b) ? "a >= b" : "a < b";
        System.out.println(line);
    }

    static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment == true) {
            System.out.println(initValue += delta);
        } else {
            System.out.println(initValue -= delta);
        }
    }

    public static void selectAction(int a) {
        switch (a) {
            case (1):
                greetings();
                break;
            case (2):
                checkSign(getRandomNumber(), getRandomNumber(), getRandomNumber());
                break;
            case (3):
                selectColor();
                break;
            case (4):
                compareNumbers();
                break;
            case (5):
                addOrSubtractAndPrint(getRandomNumber(), getRandomNumber(), true);
                break;
        }
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 20) + 1;
    }

}