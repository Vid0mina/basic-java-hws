package ru.ushakova.java.basic.hws;

public class Application {
    public static void main(String[] args) {

        int[][] arr = {{2, -1}, {1, 1}};
        int[][] mass = {{2, -1, 7}, {1, 1, 9}};

        sumOfPositiveElements(arr);
        drawingSquare(8);
        zeroDiagonal(arr);
        findMax(mass);
        findArrayString(mass);

    }

    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void drawingSquare(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void zeroDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 0;
                }
                if (i + j == array.length - 1) {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
        return max;
    }

    public static int findArrayString(int[][] array) {
        int sum = 0;
        if (array.length < 2) {
            System.out.println("-1");
            return -1;
        }
        for (int j = 0; j < array[1].length; j++) {
            sum += array[1][j];
        }
        System.out.println(sum);
        return sum;
    }

}