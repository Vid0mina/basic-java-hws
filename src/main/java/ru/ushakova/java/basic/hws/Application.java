package ru.ushakova.java.basic.hws;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1,3,5,9,1));
        sum(list);


    }

//    public List getMinMax(Integer min, Integer max){
//
//    }

    public static Integer sum(List list){
        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            Integer integer = listIterator.next();
            System.out.println(integer);
        }
        Integer sum = 0;
        return sum;
    }

}