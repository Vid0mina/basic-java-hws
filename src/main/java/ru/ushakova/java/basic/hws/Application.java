package ru.ushakova.java.basic.hws;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(6, 3, 5, 9, 1));

        getMinMax(2, 5);
        sum(list);
        replaceElements(8, list);
        increaseElemByNum(1, list);

    }

    public static List getMinMax(Integer min, Integer max) {
        List<Integer> numList = new ArrayList<>();
        int arrSize = max - min + 1;
        for (int i = 0; i < arrSize; i++) {
            numList.add(min++);
        }
        System.out.println(numList);
        return numList;
    }

    public static Integer sum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 5) {
                sum += list.get(i);
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void replaceElements(int num, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, num);
        }
        System.out.println(list);
    }

    public static void increaseElemByNum(int num, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + num);
        }
        System.out.println(list);
    }

}