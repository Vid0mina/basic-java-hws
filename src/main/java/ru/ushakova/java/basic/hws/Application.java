package ru.ushakova.java.basic.hws;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Printer printer = new Printer();

        Priority priority1 = new Priority(1, printer);
        Priority priority2 = new Priority(2, printer);
        Priority priority3 = new Priority(3, printer);

        executorService.submit(priority1);
        executorService.submit(priority2);
        executorService.submit(priority3);

        executorService.shutdown();
    }

}