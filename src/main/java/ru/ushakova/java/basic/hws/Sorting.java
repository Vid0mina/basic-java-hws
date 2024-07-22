package ru.ushakova.java.basic.hws;

import lombok.NonNull;

public class Sorting {

    public static int[] bubbleSort(@NonNull int[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    flag = true;
                    int buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                }
            }
            if (!flag) break;
        }
        return array;
    }

    public static void quickSort(int[] array, int leftIdx, int rightIdx) {
        if (array.length == 0 || leftIdx >= rightIdx) return;

        int idx = (leftIdx + rightIdx) / 2;
        int leftPart = leftIdx;
        int rightPart = rightIdx;
        int pivot = array[idx];
        int buffer = 0;

        int i = leftPart, j = rightPart;
        while (i <= j) {
            while (array[i] < pivot) i++;
            while (array[j] > pivot) j--;
            if (i <= j) {
                buffer = array[i];
                array[i] = array[j];
                array[j] = buffer;
                i++;
                j--;
            }
        }
        if (leftIdx < j) quickSort(array, leftIdx, j);
        if (rightIdx > i) quickSort(array, i, rightIdx);
    }

}