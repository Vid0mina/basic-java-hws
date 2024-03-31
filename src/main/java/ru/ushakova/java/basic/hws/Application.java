package ru.ushakova.java.basic.hws;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) throws InterruptedException {

        computeExpression();

        computeExpressionWithThreads();

    }

    public static void computeExpression() {
        final int threadNumber = 4;
        final int listSize = 100_000_000;
        double[] array = new double[listSize];
        Arrays.fill(array, 1.0);
        long time_one = System.currentTimeMillis();

        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        long time_two = System.currentTimeMillis();
        System.out.println("Время выполнения метода " + new Exception().getStackTrace()[0].getMethodName() + " составляет " + (time_two - time_one) + "\n");
    }

    public static void computeExpressionWithThreads() throws InterruptedException {
        final int threadNumber = 4;
        Thread[] threads = new Thread[threadNumber];
        final int listSize = 100_000_000;
        double[] array = new double[listSize];
        Arrays.fill(array, 1.0);
        long time_one = System.currentTimeMillis();
        int chunkSize = listSize / threadNumber;
        for (int i = 0; i < threadNumber; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i + 1) * chunkSize;
            threads[i] = new Thread(() -> {
                for (int j = startIndex; j < endIndex; j++) {
                    array[j] = 1.14 * Math.cos(j) * Math.sin(j * 0.2) * Math.cos(j / 1.2);
                }
            });
        }
        for (int i = 0; i < threadNumber; i++) {
            threads[i].start();
        }

        for (int i = 0; i < threadNumber; i++) {
            threads[i].join();
        }

        long time_two = System.currentTimeMillis();
        System.out.println("Время выполнения " + new Exception().getStackTrace()[0].getMethodName() + " составляет " + (time_two - time_one) + "\n");

    }

}