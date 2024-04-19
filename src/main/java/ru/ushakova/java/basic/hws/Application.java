package ru.ushakova.java.basic.hws;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Application {

    public static final Logger logger = LogManager.getLogger(Application.class.getClass());

    public static void main(String[] args) {

        int[] array = {1, 2, 1, 2, 2};

        int[] array1 = {1, 2, 1, 2, 2, 2};

        returnArr(array1);
        logger.info("Отработал метод returnArr");
        checkOneTwo(array);
        logger.info("Отработал метод checkOneTwo");
    }

    public static int[] returnArr(int[] arr) {
        int lastIndex = 0;
        int[] dest = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                lastIndex = i;
                dest = new int[arr.length - i - 1];
                if (arr[arr.length - 1] == 1) {
                    logger.warn("Копировать нечего.");
                    return dest;
                }
                System.arraycopy(arr, i + 1, dest, 0, arr.length - lastIndex - 1);
            }
        }
        if (dest.length == 0) {
            logger.error("В массиве не найдено ни одной единицы.");
            throw new RuntimeException("В массиве не найдено ни одной единицы.");
        }
        logger.info("Результат копирования " + Arrays.toString(dest));
        return dest;
    }

    public static boolean checkOneTwo(int[] arr) {

        boolean result = false;
        int cnt1 = 0;
        int cnt2 = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 1) {
                cnt1++;
            } else if (arr[j] == 2) {
                cnt2++;
            } else {
                logger.info("Результат соответсвия массива шаблону " + false);
                return false;
            }
        }
        if (cnt1 == 0 || cnt2 == 0) {
            result = false;
        } else {
            result = true;
        }
        logger.info("Результат соответсвия массива шаблону " + result);
        return result;
    }

}