package ru.ushakova.java.basic.hws;

public class Printer {

    private static volatile int currentPriority = 1;

    public synchronized boolean setLetterOrder(int priority, int cnt) {
        boolean flag = false;
        if (currentPriority == priority) {
            switch (priority) {
                case (1):
                    System.out.print("A");
                    currentPriority++;
                    break;
                case (2):
                    System.out.print("B");
                    currentPriority++;
                    break;
                case (3):
                    System.out.print("C");
                    currentPriority = 1;
                    break;
            }
            flag = true;
        }
        notifyAll();
        try {
            if (flag && cnt == 4 && currentPriority == 1) {
                return true;
            } else {
                wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }

    public int getCurrentPriority() {
        return currentPriority;
    }

}
