package ru.ushakova.java.basic.hws;

import java.util.Arrays;

import static ru.ushakova.java.basic.hws.Sorting.*;

public class Application {

    public static void main(String[] args) {
        int[] arr = {1, 7, 0, 2, 3, 12, 4};
        System.out.println("До сортировки: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.print("Результат быстрой сортировки: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nПузырёк: " + Arrays.toString(bubbleSort(arr)));

        PersonDataBase pd = new PersonDataBase();
        System.out.println(pd.findById(1L));

        Person person = new Person("Kuzya", Position.BRANCH_DIRECTOR, 8L);
        pd.add(person);

        System.out.println(pd.isEmployee(1L));
        System.out.println(pd.isManager(person));

    }

}