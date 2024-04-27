package ru.ushakova.java.basic.hws;

public class Priority implements Runnable {

    private volatile int priority;

    private Printer printer;

    public Priority(int priority, Printer printer) {
        this.priority = priority;
        this.printer = printer;
    }

    public int getPriority() {
        return priority;
    }

    public Printer getPrinter() {
        return printer;
    }

    @Override
    public void run() {
        int cnt = 0;
        while (cnt < 5) {
            if (printer.setLetterOrder(priority, cnt)) {
                cnt++;
            }
        }
    }

}