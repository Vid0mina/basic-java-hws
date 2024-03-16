package ru.ushakova.java.basic.hws;

import ru.ushakova.java.basic.hws.exceptions.AppArrayDataException;
import ru.ushakova.java.basic.hws.exceptions.AppArraySizeException;

public class Application {
    public static void main(String[] args) {

        String[][] arr = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};

        sumElements(arr);

    }

    public static int sumElements(String[][] arr) {
        int sum = 0;
        if (arr.length == 4 && arr[0].length == 4) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    try {
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new AppArrayDataException(arr, i, j);
                    }
                }
            }
            System.out.println("Сумма равна " + sum);
        } else {
            throw new AppArraySizeException();
        }
        return sum;
    }

}