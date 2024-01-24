package ru.ushakova.java.basic.hws;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        repeatLine("If You Want A Guarantee, Buy A Toaster", 5);
        sumArrayElements(6, 1, 5, 1, 1, 10);
        int[] arr = new int[6];
        fillArray(arr, 7);
        increaseArrayWithNumber(arr, 1);
        int[] element = {1, 1, 3, 4, 5, 6};
        compareArrayParts(element);

    }

    private static void compareArrayParts(int... arr) {

        int leftSum = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            leftSum += arr[i];
        }
        int rightSum = 0;
        for (int i = arr.length / 2; i < arr.length; i++) {
            rightSum += arr[i];
        }
        if (leftSum > rightSum) {
            System.out.println("\n(5)Метод " + new Exception().getStackTrace()[0].getMethodName() + ". Сумма левой части больше правой.");
        }
        if (leftSum < rightSum) {
            System.out.println("\n(5)Метод " + new Exception().getStackTrace()[0].getMethodName() + ". Сумма правой части больше левой.");
        } else {
            System.out.println("\n(5)Метод " + new Exception().getStackTrace()[0].getMethodName() + ". Суммы половин равны.");
        }

    }

    private static void increaseArrayWithNumber(int[] arr, int increment) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += increment;
        }
        System.out.println("\n(4)Метод " + new Exception().getStackTrace()[0].getMethodName() + " >> " + Arrays.toString(arr));
    }

    private static void fillArray(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number;
        }
        System.out.println("\n(3)Метод " + new Exception().getStackTrace()[0].getMethodName() + " >> " + Arrays.toString(arr));
    }

    private static void sumArrayElements(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println("\n(2)Метод " + new Exception().getStackTrace()[0].getMethodName() + ". Сумма = " + sum);
    }

    private static void repeatLine(String line, int i) {
        System.out.println("(1)Метод " + new Exception().getStackTrace()[0].getMethodName());
        for (int k = 0; k <= i; k++) {
            System.out.println(line);
        }
    }

}